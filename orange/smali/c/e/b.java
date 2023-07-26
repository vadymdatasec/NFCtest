public class c.e.b extends c.e.i implements java.util.Map {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<K:", */
	 /* "Ljava/lang/Object;", */
	 /* "V:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Lc/e/i<", */
	 /* "TK;TV;>;", */
	 /* "Ljava/util/Map<", */
	 /* "TK;TV;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public c.e.h i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/h<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.e.b ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lc/e/i;-><init>()V */
return;
} // .end method
public c.e.b ( ) {
/* .locals 0 */
/* .line 2 */
/* invoke-direct {p0, p1}, Lc/e/i;-><init>(I)V */
return;
} // .end method
public c.e.b ( ) {
/* .locals 0 */
/* .line 3 */
/* invoke-direct {p0, p1}, Lc/e/i;-><init>(Lc/e/i;)V */
return;
} // .end method
/* # virtual methods */
public Boolean a ( java.util.Collection p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "*>;)Z" */
/* } */
} // .end annotation
/* .line 1 */
p1 = c.e.h .c ( p0,p1 );
} // .end method
public final c.e.h b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Lc/e/h<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.i;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/e/a; */
/* invoke-direct {v0, p0}, Lc/e/a;-><init>(Lc/e/b;)V */
this.i = v0;
/* .line 3 */
} // :cond_0
v0 = this.i;
} // .end method
public java.util.Set entrySet ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
/* .line 1 */
(( c.e.b ) p0 ).b ( ); // invoke-virtual {p0}, Lc/e/b;->b()Lc/e/h;
(( c.e.h ) v0 ).d ( ); // invoke-virtual {v0}, Lc/e/h;->d()Ljava/util/Set;
} // .end method
public java.util.Set keySet ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "TK;>;" */
/* } */
} // .end annotation
/* .line 1 */
(( c.e.b ) p0 ).b ( ); // invoke-virtual {p0}, Lc/e/b;->b()Lc/e/h;
(( c.e.h ) v0 ).e ( ); // invoke-virtual {v0}, Lc/e/h;->e()Ljava/util/Set;
} // .end method
public void putAll ( java.util.Map p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "+TK;+TV;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
v1 = /* iget v0, p0, Lc/e/i;->d:I */
/* add-int/2addr v0, v1 */
(( c.e.i ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/e/i;->b(I)V
/* .line 2 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 3 */
(( c.e.i ) p0 ).put ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
return;
} // .end method
public java.util.Collection values ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Collection<", */
/* "TV;>;" */
/* } */
} // .end annotation
/* .line 1 */
(( c.e.b ) p0 ).b ( ); // invoke-virtual {p0}, Lc/e/b;->b()Lc/e/h;
(( c.e.h ) v0 ).f ( ); // invoke-virtual {v0}, Lc/e/h;->f()Ljava/util/Collection;
} // .end method
