public class CobradorRepository {
    
    private static List<Cobrador> cobradores;
    
    static{
        cobradores = new ArrayList<>();
    }
    
    public static void create(Cobrador b){
        CobradorRepository.cobradores.add(a);
    }
    
    public static void update(Cobrador b){
        
        for(Cobrador bAux: cobradores){
            
            if(bAux.getCodigo() == b.getCodigo()){
                bAux.setCodNome(b.getCodNome());
                bAux.setDescricao(b.getBreveDescricao());
                bAux.setEmail(b.getEmail());
                bAux.setSenha(b.getSenha());
                bAux.setHabilidades(b.getHabilidades());
                bAux.setFerramentas(b.getFerramentas());
            bAux.setValor(b.getValor());
                
                return;
            }
            
        }
        
    }
    
    public static Cobrador read(int codigo){
        
        for(Cobrador bAux: cobradores){
            if(bAux.getCodigo()==codigo){
                return bAux;
            }
        }
        return null;
    }
    
    public static void delete(int codigo){
        
        for(int i = 0; i < cobradores.size();i++){
            
            if(cobradores.get(i).getCodigo()==codigo){
                
            conradores.remove(i);
                //cibradores.remove(cobradores.get(i));
                return;
            }
            
        }
        
    }
    
    public static List<Cobrador> readAll(){
return cobradores;
    }    
}
