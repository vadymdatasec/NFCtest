public class c.b.p.g implements c.b.p.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.ActionMode$Callback a;
	 public final android.content.Context b;
	 public final java.util.ArrayList c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lc/b/p/h;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final c.e.i d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/i<", */
/* "Landroid/view/Menu;", */
/* "Landroid/view/Menu;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.b.p.g ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
this.a = p2;
/* .line 4 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.c = p1;
/* .line 5 */
/* new-instance p1, Lc/e/i; */
/* invoke-direct {p1}, Lc/e/i;-><init>()V */
this.d = p1;
return;
} // .end method
/* # virtual methods */
public final android.view.Menu a ( android.view.Menu p0 ) {
/* .locals 3 */
/* .line 6 */
v0 = this.d;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/Menu; */
/* if-nez v0, :cond_0 */
/* .line 7 */
/* new-instance v0, Lc/b/p/o/b0; */
v1 = this.b;
/* move-object v2, p1 */
/* check-cast v2, Lc/h/h/a/a; */
/* invoke-direct {v0, v1, v2}, Lc/b/p/o/b0;-><init>(Landroid/content/Context;Lc/h/h/a/a;)V */
/* .line 8 */
v1 = this.d;
(( c.e.i ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .line 5 */
v0 = this.a;
(( c.b.p.g ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/g;->b(Lc/b/p/c;)Landroid/view/ActionMode;
return;
} // .end method
public Boolean a ( Object p0, android.view.Menu p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( c.b.p.g ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/g;->b(Lc/b/p/c;)Landroid/view/ActionMode;
/* .line 2 */
(( c.b.p.g ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/p/g;->a(Landroid/view/Menu;)Landroid/view/Menu;
p1 = /* .line 3 */
} // .end method
public Boolean a ( Object p0, android.view.MenuItem p1 ) {
/* .locals 3 */
/* .line 4 */
v0 = this.a;
(( c.b.p.g ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/g;->b(Lc/b/p/c;)Landroid/view/ActionMode;
/* new-instance v1, Lc/b/p/o/v; */
v2 = this.b;
/* check-cast p2, Lc/h/h/a/b; */
p1 = /* invoke-direct {v1, v2, p2}, Lc/b/p/o/v;-><init>(Landroid/content/Context;Lc/h/h/a/b;)V */
} // .end method
public android.view.ActionMode b ( Object p0 ) {
/* .locals 4 */
/* .line 4 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 5 */
v2 = this.c;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/b/p/h; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 6 */
v3 = this.b;
/* if-ne v3, p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 7 */
} // :cond_1
/* new-instance v0, Lc/b/p/h; */
v1 = this.b;
/* invoke-direct {v0, v1, p1}, Lc/b/p/h;-><init>(Landroid/content/Context;Lc/b/p/c;)V */
/* .line 8 */
p1 = this.c;
(( java.util.ArrayList ) p1 ).add ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // .end method
public Boolean b ( Object p0, android.view.Menu p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( c.b.p.g ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/g;->b(Lc/b/p/c;)Landroid/view/ActionMode;
/* .line 2 */
(( c.b.p.g ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/p/g;->a(Landroid/view/Menu;)Landroid/view/Menu;
p1 = /* .line 3 */
} // .end method
