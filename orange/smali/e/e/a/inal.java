public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.ArrayList a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Le/e/a/q;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public inal ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
/* .line 3 */
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public static final void a ( Object p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( e.e.a.t ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/e/a/t;->a(I)V
return;
} // .end method
/* # virtual methods */
public final e.e.a.t a ( java.util.List p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/e/a/q;", */
/* ">;)", */
/* "Le/e/a/t;" */
/* } */
} // .end annotation
final String v0 = "bubbleShowCaseBuilderList"; // const-string v0, "bubbleShowCaseBuilderList"
i.h.c.k .d ( p1,v0 );
/* .line 2 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).addAll ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
} // .end method
public final void a ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( e.e.a.t ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/e/a/t;->a(I)V
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 3 */
/* .line 4 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lt p1, v0, :cond_0 */
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* if-nez p1, :cond_1 */
/* .line 5 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( p1 ); // invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Le/e/a/q; */
(( e.e.a.q ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Le/e/a/q;->a(Z)Le/e/a/q;
/* .line 6 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Le/e/a/q; */
(( e.e.a.q ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/e/a/q;->b(Z)Le/e/a/q;
/* .line 7 */
} // :cond_1
v2 = this.a;
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v2, v0 */
/* if-ne p1, v2, :cond_2 */
/* .line 8 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( p1 ); // invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Le/e/a/q; */
(( e.e.a.q ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/e/a/q;->a(Z)Le/e/a/q;
/* .line 9 */
v1 = this.a;
(( java.util.ArrayList ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Le/e/a/q; */
(( e.e.a.q ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Le/e/a/q;->b(Z)Le/e/a/q;
/* .line 10 */
} // :cond_2
v0 = this.a;
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Le/e/a/q; */
(( e.e.a.q ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/e/a/q;->a(Z)Le/e/a/q;
/* .line 11 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Le/e/a/q; */
(( e.e.a.q ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/e/a/q;->b(Z)Le/e/a/q;
/* .line 12 */
} // :goto_0
v0 = this.a;
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Le/e/a/q; */
/* new-instance v1, Le/e/a/s; */
/* invoke-direct {v1, p0, p1}, Le/e/a/s;-><init>(Le/e/a/t;I)V */
(( e.e.a.q ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/e/a/q;->a(Le/e/a/a0;)Le/e/a/q;
/* .line 13 */
(( e.e.a.q ) v0 ).v ( ); // invoke-virtual {v0}, Le/e/a/q;->v()Le/e/a/o;
return;
} // .end method
