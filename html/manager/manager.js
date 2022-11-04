document.addEventListener('DOMContentLoaded', () => {

    const list = document.querySelector('#list')

    const inputID = document.querySelector('#userID')
    const inputPw = document.querySelector('#pw')
    const inputRepw = document.querySelector('#repw')
    const inputUserName = document.querySelector('#userName')
    const createButton = document.querySelector('#create')

    const msg = document.querySelector('.msg')

    let cnt = 0;

    

    const addMember = () => {
        if(inputPw.value !== inputRepw.value
        ){
            alert('pw가 서로 다릅니다.')
            return
        }

        if(inputID.value.trim() === '' ||
        inputPw.value.trim() === '' ||
        inputRepw.value.trim() === '' ||
        inputUserName.value.trim() === ''){
            alert('공백은 허용하지 않습니다.')
            return
        }

        if(!/[a-zA-Z0-9]/.test(inputID.value)){
            alert('영문 대소문자, 숫자만 입력 가능합니다.')
            return
        }

        if(!/[a-zA-Z가-힣]/.test(inputUserName.value)){
            alert('이름은 영문 대소문자, 한글만 입력 가능합니다.')
            return
        }

        const key = cnt++

        const newTr = document.createElement('tr')
        list.appendChild(newTr)
        newTr.setAttribute('data-index', key)

        const index = document.createElement('td')
        newTr.appendChild(index)
        index.textContent = key

        const newID = document.createElement('td')
        newTr.appendChild(newID)
        newID.textContent = inputID.value

        const newPw = document.createElement('td')
        newTr.appendChild(newPw)
        newPw.textContent = inputPw.value

        const newUserName = document.createElement('td')
        newTr.appendChild(newUserName)
        newUserName.textContent = inputUserName.value

        const userManage = document.createElement('span')
        newTr.appendChild(userManage)
        userManage.textContent = '삭제'

        
        userManage.addEventListener('click', (event) => {
            delMember(key)
        })

        inputID.value = ''
        inputPw.value = ''
        inputRepw.value = ''
        inputUserName.value = ''
    }

    inputID.addEventListener('focusout', () => {
        const  msgDiv = document.querySelector('#userID + div')

        if(inputID.value.trim() === ''){
            msgDiv.textContent = '공백은 허용하지 않습니다.'
        }else if(!/[a-zA-Z0-9]/.test(inputID.value)){
            msgDiv.textContent = '영문 대소문자, 숫자만 입력 가능합니다.'
        } else{
            msgDiv.textContent = ''
        }
    })

    inputPw.addEventListener('focusout', () => {
        const msgDiv = document.querySelector('#pw + div')

        if(inputPw.value.trim() === ''){
            msgDiv.textContent = '공백은 허용하지 않습니다.'
        } else{
            msgDiv.textContent = ''
        }
    })

    inputRepw.addEventListener('focusout', () => {
        const msgDiv = document.querySelector('#repw + div')

        if(inputPw.value !== inputRepw.value){
                msgDiv.textContent = 'pw가 서로 다릅니다.'
            } else{
                msgDiv.textContent = ''
            }
    })

    inputUserName.addEventListener('focusout', () => {
        const  msgDiv = document.querySelector('#userName + div')

        if(inputUserName.value.trim() === ''){
            msgDiv.textContent = '공백은 허용하지 않습니다.'
        }else if(!/[a-zA-Z가-힣]/.test(inputUserName.value)){
            msgDiv.textContent = '영문 대소문자, 한글만 입력 가능합니다.'
        } else{
            msgDiv.textContent = ''
        }
    })


    const delMember = (key) => {
        const delTr = document.querySelector(`tr[data-index="${key}"]`)
        list.removeChild(delTr)
    }


    createButton.addEventListener('click', addMember)
    
})