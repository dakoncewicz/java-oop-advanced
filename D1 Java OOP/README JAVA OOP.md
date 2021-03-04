## Java Object Oriented Programming
### Description :
    OOP - Object Oriented Programming - koncepcja jest powiązana z językami programowania, które korzystają z obiektów. OOP wprowadza i łączy koncepcje, takie jak:
    * enkapsulacja,
    * abstrakcja,
    * dziedziczenie, 
    * polimorfizm,
    * + kompozycja.  

Structure :
+----- D1 Java OOP
|       |
|       +-- Encapsulation-Abstraction ( ...)
|           |
|           +-- Start
|           +-- Finish
+--src
    |
    +-- com.dkoncewicz
        |
        +-- Main (class)

**Tips&Trics : Shift + Cmd + V  (Preview)**

### Section 1 : Enkapsulacja i Abstrakcja
#### Lesson 1 : Enkapsulacja
    Zaczynamy: Uruchamiamy InteliJ - Tworzymy nowy Projekt - Wskazujemy JDK - Wybieramy opcję [Create project from template - Command Line App]

        1. Task : Obejrzyj kod startowy, co jest w nim złego?
            Program, narusza zasady programowania obiektowego. Dlaczego?
        2. Task  : Zadeklaruj nową klasę Employee{} i zrefaktoruj kod w Main{}
            - zadeklaruj zmienne jako publiczne za wyjątkiem extraHours
            - zakładamy ze _extraHours_ zmienia się z miesiąca na miesiąc
            - w metodzie main() zadeklaruj obiekt employee i zrefaktoruj kod 
        3. Task : Dodaj Getter / Setter dla klasy Emplyee
            - dodaj sprawdzenie czy _baseSalary < 0_
            - utwórz ręcznie getter() i setter() dla _baseSalary_
            - refaktoryzacja kodu Alt + Enter (dodanie nowych usług + refaktoryzacja main() )

#### Lesson 2: Abstrakcja
    Drugie pryncypium. Ukrywanie wewnętrznej złozoności implementacji klasy
        1. Task : usunięcie nieuzywanych metod (getter())/ zamienic modyfikator na private

        2. Task : Dodanie Konstruktora do klasy
            - przenieś wartości początkowych do Construktora (baseSalaty, hourlyRate)

        3. Task : Klasy wewnętrzne  - Modyfikatory dostępu
            - zamiana setBaseSallary() na klasę wewnętrzną - modyfikator _private_
        
        4. Task : Przeciązania metod i konstruktoró∑
            - przeciązenie metody - BRAK PRZYKŁADU
            - dodaj drugi konstruktor tylko z parametrem _baseSalaty_
            - TIPS : Cmd + B - navigate to declaration

        5. Task : Static Memmbers 
            - dodaj zmienną  public static int numberOfEmployees; do klasy Employee{}
            - zmienna będzie zliczała iloś utworzynych obiektów klasie

### Section 2: Dziedziczenie i Polimorfizm
#### Lesson 1 : Dziedziczenie
    Trzecie pryncypium. Unikanie powtarzanie tej samej części kodu w rónych obiektach.
    Zaczynamy. kopiujemy z folderu start metody main() oraz klasę UIControl
        1. Task : Utwórz klasę TexBox która dziedziczy po klasie UIControl
        2. Task : Konstruktor bezparametrowy i dziedziczenie
            - Cmd + N - generujemy konstruktor dla klasy UIControl{}
            - utwórz konstruktory dla klas UIControl oraz TextBox
            - zobacz w jakiej kolejności są drukowane na konsoli komunikaty z konstruktorów
        3. Task : Dodaj konstruktor z parametrami - klasa UIControl()
            - nalezy takze dodac jawne wywołanie konstruktora w konstruktorze klasy TexBox()
        4. Overriding - nadpisywanie metod klasy bazowej
            - zaimplementuj metodę toString() w klasie TextBox{}
            - zademonstruj róznice w wywołaniu tej metody z klasy UIControl()
        5. Task : Zadanie - Jak porównac dwa obiekty?

#### Lesson 2 : Polimorfizm
    Czwarte i ostatnie pryncypim OOP. Praktyczne wykorzystanie koncepcji dziedziczenia - wykonywanie operacji na nadklasie pozostawiają wybór właściwej implementacji mechanizmom języka.
        1. Task : Polimorfizm
            - Zaimplementuj nową klasę CheckBox{}, usuń jawny konstruktor w UIControl()
            - zbuduj tablicę obiektów w metodzie main()
                - UIControl[] controls = { new TextBox(), new CheckBox()};
            - Opcjonalnie : wpisz "kod proceuralny" do renderowania tablicy dla porównania z podejsciem obiektowym
            - dodaj pustą metodę render() do UIControl
            - wygeneruj metody "nadpisujące" dla klas potomnych 
              - TIP&TRICS - Use : Ctrl + O
            - dodaj kod obiektowy renderujący w metodzie main()
        2. Task : Abstract classes and abstract methods
            - Zademonstruj uzycie klasy abstrakcyjne na przykładzie UIControl{}
            - ZAdemonstruj uycie metody abstrakcyjnej - UIControl.render()
            - Co się stanie jak w klasie CheckBox{} usuniemy implementację render ?
        3. Task : Final classes and final method
            - zadeklaruj klasę TextBox jako final
            - co się stanie po zadeklarowaniu klasy PasswordBox dziedziczącej po TextBox{} ?

### Section 3: Interfejsy

#### Lesson 1 : Interfejsy wprowadzenie

        1. Task 1:  Utwórz klasy początkowe : TaxCalculator{} i TaxReport{}
            - klasy są przykładem kodu mocno powiązanego
              - co się stanie jeśli będziemy chcieli dodac dodatkowy parametr do konstruktora TaxCalculator ?
              - potrzebna będzie rekompilacja całego kodu
              - podobnie w sytuacji gdy zmienimy wewnątrz metody TaxCalculator.calculateTax() sposób wyliczania podatku
        2. Task 2 : Dodaj interfejs aby osłabic powiązanie pomiedzy klasami
            - refaktoruj klasę TaxCalculator > TaxCalculator2020
            - dodaj intefejs TaxCalculator{}
              - słowo kluczowe public dla metody calculateTax() jest zbędne - usuń je
            - dodaj znacznik @Override dla metody TaxCalculator2020.calculateTax()
    
    Konkluzja : mamy rozseparowane powiązanie pomiędzy TaxCalculator2020{} oraz TaxReport{} ALE
                wciąz mamy jawne wskazanie w TaxReport na konkretną implementację:  
                    *private TaxCalculator2020 calculator;*
#### Lesson 2 : Separation of Concernce & Dependency Injection

        1. Task : Usuń jawne wskazanie w klasie TaxReport
            - zastosuj **Constructor Incjection** w konstruktorze TaxReport
            - w metodzie main() powołaj nowy obiekt calculator = new TaxCalculator2020()
  
        2. Task : 

#### Zadanie : Refaktoryzacja aplikacji MyTube.com
    Uzyjemy podobnych technik co były omówione w lekcji 2.
        Krok 1 Decoupling klas VideoEncoder oraz VideoProcessor
            - Utwórz interfejs klasy VideoRecorder - Trick: 
              - Przejdz do klasy VideoEncorder > Refactor > Extract > Interface
              - Opcja : Rename oryginal class and use interface where possible
                - nazwij klasę XVideoEncoder
            - Zastosuj Dependenci Injection principle dla klasy VideoEncoder
              - zadeklaruj zmienną private encode w klasie VideoProcessor
              - wygeneruje konstruktor dla VideoProcessor, przekaz obiekt WideoEncoder w parametrze konstruktora
            - Usuń jawne przypisanie VideoEncoder w metodzie VideoProcessor.process()
        Krok 2 Zastosuj te same kroki dla klas: VideoDatabase oraz EmailServices
            - zamień nazwę klasy EmailService > NotificationService
    Konkluzja: otrzymaliśmy czetelniejszy kod, z jasno określonymi odpowiedzialnościami. 
                Dodatkowo usunięcie zalenzności jest punktem wyjscia do praktycznego zastosowania UnitTests.
                
