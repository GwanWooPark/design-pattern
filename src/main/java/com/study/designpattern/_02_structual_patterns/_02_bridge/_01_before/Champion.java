package com.study.designpattern._02_structual_patterns._02_bridge._01_before;

public interface Champion {

    /**
     * 이와 같은 방법의 단점
     * 스킨뿐만 아니라 스킬등이 계층구조에 반영되기 시작하면 클래스가 겉잡을 수 없이 늘어나게 됨.
     * 해결 방법
     *   1. 동작, 액션(스킨)등은 Champion에 남겨둔다.
     *   2. 스킬과 같은 것들을 분리해서 또 다른 계층 구조로 만든다.
     *   Client: Abstraction을 사용하는 코드
     *   Abstraction: 고차원의 추상적인 logic을 담고 있는 클래스
     *   Refined Abstraction: Abstraction을 구현, 상속받는 하위 클래스(추상적인 개념들을 변형 및 확장한 Child Class)
     *   Implementation: Abstraction이 사용. 구체적인 정보를 담고 있는 클래스 (상태, 동작, 플랫폼에 특화된 코드 등등)
     *   Concrete Implementation:
     */
    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();
}
