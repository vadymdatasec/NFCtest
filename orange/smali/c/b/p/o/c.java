public abstract class c.b.p.o.c {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public java.util.Map b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Lc/h/h/a/b;", */
	 /* "Landroid/view/MenuItem;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.util.Map c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Object;", */
/* "Landroid/view/SubMenu;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.b.p.o.c ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public final android.view.MenuItem a ( android.view.MenuItem p0 ) {
/* .locals 2 */
/* .line 1 */
/* instance-of v0, p1, Lc/h/h/a/b; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* move-object v0, p1 */
/* check-cast v0, Lc/h/h/a/b; */
/* .line 3 */
v1 = this.b;
/* if-nez v1, :cond_0 */
/* .line 4 */
/* new-instance v1, Lc/e/b; */
/* invoke-direct {v1}, Lc/e/b;-><init>()V */
this.b = v1;
/* .line 5 */
} // :cond_0
v1 = this.b;
/* check-cast p1, Landroid/view/MenuItem; */
/* if-nez p1, :cond_1 */
/* .line 6 */
/* new-instance p1, Lc/b/p/o/v; */
v1 = this.a;
/* invoke-direct {p1, v1, v0}, Lc/b/p/o/v;-><init>(Landroid/content/Context;Lc/h/h/a/b;)V */
/* .line 7 */
v1 = this.b;
} // :cond_1
} // .end method
public final android.view.SubMenu a ( android.view.SubMenu p0 ) {
/* .locals 0 */
} // .end method
public final void a ( Integer p0 ) {
/* .locals 2 */
/* .line 8 */
v0 = this.b;
/* if-nez v0, :cond_0 */
return;
/* .line 9 */
} // :cond_0
/* .line 10 */
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 11 */
/* check-cast v1, Landroid/view/MenuItem; */
v1 = /* .line 12 */
/* if-ne p1, v1, :cond_1 */
/* .line 13 */
} // :cond_2
return;
} // .end method
public final void b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* .line 3 */
} // :cond_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
} // :cond_1
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 2 */
/* .line 5 */
v0 = this.b;
/* if-nez v0, :cond_0 */
return;
/* .line 6 */
} // :cond_0
/* .line 7 */
v1 = } // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 8 */
/* check-cast v1, Landroid/view/MenuItem; */
v1 = /* .line 9 */
/* if-ne p1, v1, :cond_1 */
/* .line 10 */
} // :cond_2
return;
} // .end method
