# Exemplo_Binding

Steps:

1. Activar Binding no build.gradle(Module.app):
  buildFeatures {
    viewBinding true
  }
  
 2. Sincronizar projecto;
 
 3. Na Classe Java
    - Criar variável globla do binding a ser usado: ActivityMainBinding;
    
    (Verificar se foi importado)
    
 4. Alterar o método onCreate: 
    mainBinding = ActivityMainBinding.inflate (getLayoutInflater());
    setContentView (mainBinding.getRoot());
    
 5. usar o binding para get e Set dos textos:
 
   get: String nome = mainBinding.nameEditText.getText.toString();
    
   Set: mainBinding.nameEditText.setText("Ola mundo");
