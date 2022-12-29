import React from 'react';
import Header from "./Header";
import Nav from "./Nav";
import Section from "./Section";
import Aside from "./Aside";
import Footer from "./Footer";

const header = {
    title: 'Jinsols blog',
    description: '웹을 공부하는 블로그'
}

const nav = {
    li: [
        'HTML', 'CSS', 'JavaScript'
    ]
}

const article1 = {
    title: 'article1Title',
    date: '2022-11-01',
    imgUrl: 'Img/html5.png',
    description: '(서울=연합뉴스) 김주환 기자 = 게임물관리위원회가 최근 확산한 불공정\n' +
        '            심의 논란, 전산망 구축 비리 의혹 등과 관련해 게임 이용자들과 소통을\n' +
        '            강화하기 위한 각종 조치를 내놓기로 했다. 게임위는 오는 10일 오전\n' +
        '            서울 서대문구 수도권사무소 회의실에서 기자 간담회를 열어 \'게임이용자\n' +
        '            소통 강화 방안\'을 발표한다고 1일 밝혔다. 간담회에는 김규철 위원장을\n' +
        '            비롯해 사무국장, 본부장, 정책연구소장 등 관계자 6명이 참석해 최근\n' +
        '            현안에 대한 후속 조치를 밝힐 예정이다. 1번 아티클 테스트'
}

const article2 = {
    title: 'article2Title',
    date: '2022-11-01',
    imgUrl: 'Img/html5.png',
    description: '(서울=연합뉴스) 김주환 기자 = 게임물관리위원회가 최근 확산한 불공정\n' +
        '            심의 논란, 전산망 구축 비리 의혹 등과 관련해 게임 이용자들과 소통을\n' +
        '            강화하기 위한 각종 조치를 내놓기로 했다. 게임위는 오는 10일 오전\n' +
        '            서울 서대문구 수도권사무소 회의실에서 기자 간담회를 열어 \'게임이용자\n' +
        '            소통 강화 방안\'을 발표한다고 1일 밝혔다. 간담회에는 김규철 위원장을\n' +
        '            비롯해 사무국장, 본부장, 정책연구소장 등 관계자 6명이 참석해 최근\n' +
        '            현안에 대한 후속 조치를 밝힐 예정이다. 2번 아티클 테스트'
}

const aside = {

    category: [
      'category1Test', 'category2Test', 'category3Test', 'category4Test', 'category5Test'
    ],

    latest: [
        'latest1Test', 'latest2Test', 'latest3Test', 'latest4Test',
    ]

}

const footer = {
    creater: 'Create by Jinsol'
}

function Container(props) {
    return (
        <div>
            <Header header={header}/>
            <Nav nav={nav}/>

            <div id="wrap">
                <Section article={article1}/>
                <Section article={article2}/>
                <Aside aside={aside}/>
            </div>

            <Footer footer={footer}/>
        </div>
    );
}

export default Container;