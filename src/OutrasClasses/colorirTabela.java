package OutrasClasses;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class colorirTabela extends JTable{

    /**
     *
     * @param renderer
     * @param row
     * @param column
     * @return
     */
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component componenteRenderer = super.prepareRenderer(renderer, row, column);
       

        componenteRenderer.setBackground(getBackground());
        componenteRenderer.setForeground(getBackground());
        if (getValueAt(row, column) != null) {
            String status = (String) getValueAt(row, column);
            if (status.equals("MORTO")) {
                
                componenteRenderer.setBackground(Color.RED);
            }
        }

        return componenteRenderer;
    }
    


    /*
    
  public Component getTableCellRendererComponent(JTable table, Object value,
      boolean isSelected, boolean hasFocus, int row, int column) {
    Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(
        table, value, isSelected, hasFocus, row, column);
    ((JLabel) renderer).setOpaque(true);
    Color foreground, background;
    if (isSelected) {
      foreground = Color.yellow;
      background = Color.green;
    } else {
      if (row % 2 == 0) {
        foreground = Color.blue;
        background = Color.white;
      } else {
        foreground = Color.white;
        background = Color.blue;
      }
    }
    renderer.setForeground(foreground);
    renderer.setBackground(background);
    return renderer;
  }
    
    
    
    
    
    
    
    
    /*
    public void corTabelaAnimais(JTable tabelaParamentro) {

        System.out.println("aqui");
        tabelaParamentro.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                    
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                System.out.println("aqui 22");

                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                //A coluna do status é 3
                Color c = Color.WHITE;
                Object ref = table.getValueAt(row, 2);//Coluna Status
                //Coloca cor em todas as linhas,COLUNA(3) que tem o valor "Aberto"
                if (ref != null && ref.equals("MORTO")) {//Se Status for igual a "Aberto"
                    c = Color.RED;
                    label.setBackground(c);//Preenche a linha de vermelho
                    tabelaParamentro.setSelectionForeground(Color.GREEN);//E a fonte de branco
                    System.out.println("morto");
                
                }
                return label;
            }
            
        });
    }
    
    public JComponent mudarCores(DefaultTableModel tabelaModel){
        System.out.println("1");
        JTable table = new JTable(tabelaModel){
            @Override
            public Component prepareRenderer (TableCellRenderer renderer, int row, int column){
                Component component = super.prepareRenderer(renderer, row, column);
                component.setBackground(Color.BLUE);
                if(!isRowSelected(row)){
                    component.setBackground(getBackground());
                    int linha = convertRowIndexToModel(row);
                    int idade = (int) getModel().getValueAt(linha, 5);
                    if(idade > 0)
                        component.setBackground(Color.BLUE);
                    
                } 
                return component;
            }
        };
        return table;
                   
    }

     */
}
