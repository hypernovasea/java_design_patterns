package iterator;


public class XMenIterator implements Iterator {

    XMan[] xmen;
    int position;

    public XMenIterator(XMan[] xmen) {
        this.xmen = xmen;
    }

    public XMan next() {
        XMan x = xmen[position];
        position = position + 1;
        return x;
    }

    public boolean hasNext() {
        if(position >= xmen.length || xmen[position] == null) {
            return false;
        } else {
            return true;
        }
    }

}
