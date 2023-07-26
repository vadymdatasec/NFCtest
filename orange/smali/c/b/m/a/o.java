public abstract class c.b.m.a.o extends c.b.m.a.l {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "RestrictedAPI" */
	 /* } */
} // .end annotation
/* # instance fields */
public c.b.m.a.n n;
public Boolean o;
/* # direct methods */
public c.b.m.a.o ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Lc/b/m/a/l;-><init>()V */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 2 */
		 (( c.b.m.a.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/m/a/o;->a(Lc/b/m/a/k;)V
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 6 */
	 /* invoke-super {p0, p1}, Lc/b/m/a/l;->a(Lc/b/m/a/k;)V */
	 /* .line 7 */
	 /* instance-of v0, p1, Lc/b/m/a/n; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 8 */
		 /* check-cast p1, Lc/b/m/a/n; */
		 this.n = p1;
	 } // :cond_0
	 return;
} // .end method
public a ( android.util.AttributeSet p0 ) {
	 /* .locals 8 */
	 v0 = 	 /* .line 1 */
	 /* .line 2 */
	 /* new-array v1, v0, [I */
	 int v2 = 0; // const/4 v2, 0x0
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v3, v0, :cond_2 */
v5 = /* .line 3 */
if ( v5 != null) { // if-eqz v5, :cond_1
	 /* const v6, 0x10100d0 */
	 /* if-eq v5, v6, :cond_1 */
	 /* const v6, 0x1010199 */
	 /* if-eq v5, v6, :cond_1 */
	 /* add-int/lit8 v6, v4, 0x1 */
	 v7 = 	 /* .line 4 */
	 if ( v7 != null) { // if-eqz v7, :cond_0
	 } // :cond_0
	 /* neg-int v5, v5 */
} // :goto_1
/* aput v5, v1, v4 */
/* move v4, v6 */
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
/* .line 5 */
} // :cond_2
android.util.StateSet .trimStateSet ( v1,v4 );
} // .end method
public void applyTheme ( android.content.res.Resources$Theme p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/m/a/l;->applyTheme(Landroid/content/res/Resources$Theme;)V */
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).getState ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I
(( c.b.m.a.o ) p0 ).onStateChange ( p1 ); // invoke-virtual {p0, p1}, Lc/b/m/a/o;->onStateChange([I)Z
return;
} // .end method
public android.graphics.drawable.Drawable mutate ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/m/a/o;->o:Z */
/* if-nez v0, :cond_0 */
/* invoke-super {p0}, Lc/b/m/a/l;->mutate()Landroid/graphics/drawable/Drawable; */
/* if-ne p0, p0, :cond_0 */
/* .line 2 */
v0 = this.n;
(( c.b.m.a.k ) v0 ).n ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->n()V
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Lc/b/m/a/o;->o:Z */
} // :cond_0
} // .end method
public abstract Boolean onStateChange ( Integer[] p0 ) {
} // .end method
