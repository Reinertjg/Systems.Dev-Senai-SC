## **Métodos de HTTP**

### **GET**   
 * O método GET é utilizado para socilicitar a representação de um recurso especifico.    
 * Ele é usado para recuperar dados de um servidor, como páginas da web, imagens ou outros recursos.    
 * O método GET não deve ser usado para operações que causam efeitos colaterais no servidor, como alterações de estado ou criação de recursos.   

 ### **POST** 
 * O método POST é utilizado para atualizar um recurso existente no servidor.    
 * Ele substitui completamente a representação atual do recurso pelo conteúdo enviado na requisição.    
 * O método PUT é idempotente, o que significa que múltiplas requisições idênticas produxirão.

### **DELETE** 
 * O método DELETE é utilizado para remover um recurso específico do servidor.   
 * Ele remove permanentemente o recurso identificado pelo URI fornecida na requisição.   
 * Assim como o PUT, o método DELETE também é idempotente.   

 ### **PATCH** 
  * O métedo PATCH é utilizado para aplicar modificações parciais a um recurso existente no servidor.   
  * Ele permite que o cliente envie apenas as alterações que deseja fazer no recurso, em vez de enviar a representação completa.   