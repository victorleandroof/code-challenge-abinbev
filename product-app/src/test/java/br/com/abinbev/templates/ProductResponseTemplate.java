package br.com.abinbev.templates;


import br.com.abinbev.controller.response.ProductResponse;
import br.com.abinbev.domain.Product;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class ProductResponseTemplate implements TemplateLoader {


    @Override
    public void load() {
        Fixture.of(ProductResponse.class).addTemplate("valid", new Rule(){{
            add("id", "c4ca4238a0b923820dcc509a6f75849b");
            add("name","Corona");
            add("description","Corona is not just a beer, it's a " +
                                             "lifestyle. An invitation to disconnect " +
                                             "from the routine and enjoy " +
                                             "life more outside, on the beach " +
                                             "and enjoying a sunset with friends.");
            add("price","4.99");
            add("brand","ambev");
        }});
    }
}
