public abstract class m.b.k.e extends m.b.k.q0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.ArrayList a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lm/b/k/q0;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Integer b;
/* # direct methods */
public m.b.k.e ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lm/b/k/q0;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Lm/b/k/e;->b:I */
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
return;
} // .end method
public m.b.k.e ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "Lm/b/k/q0;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 4 */
/* invoke-direct {p0}, Lm/b/k/e;-><init>()V */
/* .line 5 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).addAll ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* .line 6 */
(( m.b.k.e ) p0 ).b ( ); // invoke-virtual {p0}, Lm/b/k/e;->b()V
return;
} // .end method
/* # virtual methods */
public m.b.k.q0 a ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lm/b/k/e;->b:I */
/* if-lez v0, :cond_0 */
v1 = this.a;
/* add-int/lit8 v0, v0, -0x1 */
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lm/b/k/q0; */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void a ( m.b.k.q0 p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.a;
/* iget v1, p0, Lm/b/k/e;->b:I */
/* add-int/lit8 v1, v1, -0x1 */
(( java.util.ArrayList ) v0 ).set ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* iput v0, p0, Lm/b/k/e;->b:I */
return;
} // .end method
