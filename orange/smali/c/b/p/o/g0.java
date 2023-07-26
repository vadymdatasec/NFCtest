public class c.b.p.o.g0 extends c.b.p.o.m implements android.view.SubMenu {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.b.p.o.m B;
	 public c.b.p.o.p C;
	 /* # direct methods */
	 public c.b.p.o.g0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Lc/b/p/o/m;-><init>(Landroid/content/Context;)V */
		 /* .line 2 */
		 this.B = p2;
		 /* .line 3 */
		 this.C = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( c.b.p.o.m$a p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.B;
		 (( c.b.p.o.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/o/m;->a(Lc/b/p/o/m$a;)V
		 return;
	 } // .end method
	 public Boolean a ( Object p0, android.view.MenuItem p1 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = 		 /* invoke-super {p0, p1, p2}, Lc/b/p/o/m;->a(Lc/b/p/o/m;Landroid/view/MenuItem;)Z */
		 /* if-nez v0, :cond_1 */
		 v0 = this.B;
		 /* .line 3 */
		 p1 = 		 (( c.b.p.o.m ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/p/o/m;->a(Lc/b/p/o/m;Landroid/view/MenuItem;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.B;
p1 = (( c.b.p.o.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/o/m;->a(Lc/b/p/o/p;)Z
} // .end method
public Boolean b ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
p1 = (( c.b.p.o.m ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/o/m;->b(Lc/b/p/o/p;)Z
} // .end method
public java.lang.String d ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.C;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.p.o.p ) v0 ).getItemId ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->getItemId()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-super {p0}, Lc/b/p/o/m;->d()Ljava/lang/String; */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ":"; // const-string v2, ":"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public android.view.MenuItem getItem ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.C;
} // .end method
public c.b.p.o.m m ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
(( c.b.p.o.m ) v0 ).m ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->m()Lc/b/p/o/m;
} // .end method
public Boolean o ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
v0 = (( c.b.p.o.m ) v0 ).o ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->o()Z
} // .end method
public Boolean p ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
v0 = (( c.b.p.o.m ) v0 ).p ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->p()Z
} // .end method
public Boolean q ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
v0 = (( c.b.p.o.m ) v0 ).q ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->q()Z
} // .end method
public void setGroupDividerEnabled ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
(( c.b.p.o.m ) v0 ).setGroupDividerEnabled ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/o/m;->setGroupDividerEnabled(Z)V
return;
} // .end method
public android.view.SubMenu setHeaderIcon ( Integer p0 ) {
/* .locals 0 */
/* .line 2 */
/* invoke-super {p0, p1}, Lc/b/p/o/m;->d(I)Lc/b/p/o/m; */
/* move-object p1, p0 */
/* check-cast p1, Landroid/view/SubMenu; */
} // .end method
public android.view.SubMenu setHeaderIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/p/o/m;->a(Landroid/graphics/drawable/Drawable;)Lc/b/p/o/m; */
/* move-object p1, p0 */
/* check-cast p1, Landroid/view/SubMenu; */
} // .end method
public android.view.SubMenu setHeaderTitle ( Integer p0 ) {
/* .locals 0 */
/* .line 2 */
/* invoke-super {p0, p1}, Lc/b/p/o/m;->e(I)Lc/b/p/o/m; */
/* move-object p1, p0 */
/* check-cast p1, Landroid/view/SubMenu; */
} // .end method
public android.view.SubMenu setHeaderTitle ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/p/o/m;->a(Ljava/lang/CharSequence;)Lc/b/p/o/m; */
/* move-object p1, p0 */
/* check-cast p1, Landroid/view/SubMenu; */
} // .end method
public android.view.SubMenu setHeaderView ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/p/o/m;->a(Landroid/view/View;)Lc/b/p/o/m; */
/* move-object p1, p0 */
/* check-cast p1, Landroid/view/SubMenu; */
} // .end method
public android.view.SubMenu setIcon ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.C;
(( c.b.p.o.p ) v0 ).setIcon ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/o/p;->setIcon(I)Landroid/view/MenuItem;
} // .end method
public android.view.SubMenu setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.C;
(( c.b.p.o.p ) v0 ).setIcon ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/o/p;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
} // .end method
public void setQwertyMode ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
(( c.b.p.o.m ) v0 ).setQwertyMode ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/o/m;->setQwertyMode(Z)V
return;
} // .end method
public android.view.Menu t ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
} // .end method
