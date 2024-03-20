

public class DevedorRepository {
    
    private static List<Devedor> devedores;
    
    static{
        devedores = new ArrayList<>();
    }
    
    public static void create(Devedor c){
        DevedorRepository.devedores.add(c);
    }
    
    public static void update(Devedor c){
        
        for(Devedor cAux: devedores){
            
            if(cAux.getCodigo() == c.getCodigo()){
                bAux.setNomeCompleto(b.getNomeCompleto());
                bAux.setMae(b.getMae());
                bAux.setPai(b.getPai());
                bAux.setEndereco(b.getEndereco());
                bAux.setTelefone(b.getTelefone());
                bAux.setEmail(b.getEmail());
                bAux.setInformacoesPertinentes(b.getInformacoesPertinentes());
                bAux.setCaracteristicasFisicas(b.getCaracteristicasFisicas());
                bAux.setAnoNascimento(b.getAnoNascimento());
                bAux.setProfissao(b.getProfissao());
                
                
                
                return;
            }
            
        }
        
    }
    
    public static Devedor read(int codigo){
        
        for(Devedor cAux: devedores){
            if(cAux.getCodigo()==codigo){
                return cAux;
            }
        }
        return null;
    }
    
    public static void delete(int codigo){
        
        for(int i = 0; i < devedores.size();i++){
            
            if(devedores.get(i).getCodigo()==codigo){
                
                devedores.remove(i);
                //devedores.remove(devedores.get(i));
                return;
            }
            
        }
        
    }
    
    public static List<Devedor> readAll(){
        return devedores;
    }    
}