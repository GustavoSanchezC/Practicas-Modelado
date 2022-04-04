

public class MenuCompleto {

    private Object menus[] = new Object[3];
    private Menu menuParticular[] = new Menu[3];
    private MenuGeneral gen = new MenuGeneral();
    private MenuDelDia diario = new MenuDelDia();
    private MenuDeluxe dx = new MenuDeluxe();

    /**
     * contreuctor de todos los menus en general
     */
    public MenuCompleto() {
        menus[0] = gen.getIterador();
        menuParticular[0] = gen;
        menus[1] = diario.getIterator();
        menuParticular[1] = diario;
        menus[2] = dx.getIterator();
        menuParticular[2] = dx;
    }

    /**
     * obtienes todos los iteradores de los menus
     *
     * @return
     */
    public Object[] getMenu() {
        return menus;
    }

    /**
     * metodo para selecionar menu
     *
     * @param posicion del menu
     * @return regresa el menu selecionado
     */
    public Menu getMenuParticular(int posicion) {
        return menuParticular[posicion];
    }
}