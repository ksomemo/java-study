# Java

## Javaとは
* プログラミング言語

### 特徴
* Javaの場合は、どのマシン上でコンパイルしたものでも動く(後述のJVM参照)
* この特徴は「Write Once, Anywhere」と呼ばれる
* Windows上でC/C++をCコンパイラでコンパイルすると、WindowsでのCPUにあった機械語を生成
* Unix上で動作させたいのであれば、Unix上でのCコンパイラでコンパイルする必要がある

## JVMとは
* Java Virtual Machine(Java仮想マシン)と呼ばれるソフトウェア
* Javaの場合、コンパイルすると機械語ではなくバイトコードを生成する
* バイトコードはマシン依存の機械語ではない
* バイトコードを解釈して実行するJVMの一部であるJavaインタプリタで実際に動作する
* JVMは各マシン用に用意されている(Windows,Unix,など)

## コンパイルと実行
* コンパイルは、`javac ClassName.java`
* コンパイルすると、ClassName.classが生成される(バイトコード)
* Intellj IDEAの場合、srcディレクトリのソースをコンパイルすると、outディレクトリに生成される
* 実行は、`java ClassName`
