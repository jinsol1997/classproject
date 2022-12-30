import React from 'react';
import Toolbar from "@mui/material/Toolbar";
import IconButton from "@mui/material/IconButton";
import MenuIcon from "@mui/icons-material/Menu";
import Typography from "@mui/material/Typography";

function CustomToolbar({title, handleDrawerOpen}, open) {
    return (
        <Toolbar>
            <IconButton
                size="large"
                color="inherit"
                aria-label="menu"
                onClick={handleDrawerOpen}
                edge="start"
                sx={{ mr: 2, ...(open && { display: 'none' }) }}
            >
                <MenuIcon />
            </IconButton>
            <Typography variant="h6" noWrap component="div">
                {title}
            </Typography>
        </Toolbar>
    );
}

export default CustomToolbar;