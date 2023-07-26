public class c.b.p.e extends android.content.ContextWrapper {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer a;
	 public android.content.res.Resources$Theme b;
	 public android.view.LayoutInflater c;
	 public android.content.res.Configuration d;
	 public android.content.res.Resources e;
	 /* # direct methods */
	 public c.b.p.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V */
		 /* .line 2 */
		 /* iput p2, p0, Lc/b/p/e;->a:I */
		 return;
	 } // .end method
	 public c.b.p.e ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V */
		 /* .line 4 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final android.content.res.Resources a ( ) {
		 /* .locals 3 */
		 /* .line 6 */
		 v0 = this.e;
		 /* if-nez v0, :cond_1 */
		 /* .line 7 */
		 v0 = this.d;
		 /* if-nez v0, :cond_0 */
		 /* .line 8 */
		 /* invoke-super {p0}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources; */
		 this.e = v0;
		 /* .line 9 */
	 } // :cond_0
	 /* const/16 v2, 0x11 */
	 /* if-lt v1, v2, :cond_1 */
	 /* .line 10 */
	 (( android.content.ContextWrapper ) p0 ).createConfigurationContext ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/ContextWrapper;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;
	 /* .line 11 */
	 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 this.e = v0;
	 /* .line 12 */
} // :cond_1
} // :goto_0
v0 = this.e;
} // .end method
public void a ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
/* if-nez v0, :cond_1 */
/* .line 2 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 3 */
/* new-instance v0, Landroid/content/res/Configuration; */
/* invoke-direct {v0, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V */
this.d = v0;
return;
/* .line 4 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Override configuration has already been set"; // const-string v0, "Override configuration has already been set"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 5 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "getResources() or getAssets() has already been called"; // const-string v0, "getResources() or getAssets() has already been called"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( android.content.res.Resources$Theme p0, Integer p1, Boolean p2 ) {
/* .locals 0 */
int p3 = 1; // const/4 p3, 0x1
/* .line 13 */
(( android.content.res.Resources$Theme ) p1 ).applyStyle ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V
return;
} // .end method
public void attachBaseContext ( android.content.Context p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V */
return;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/p/e;->a:I */
} // .end method
public final void c ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
(( c.b.p.e ) p0 ).getResources ( ); // invoke-virtual {p0}, Lc/b/p/e;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).newTheme ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;
this.b = v1;
/* .line 3 */
(( android.content.ContextWrapper ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getTheme ( ); // invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
v2 = this.b;
(( android.content.res.Resources$Theme ) v2 ).setTo ( v1 ); // invoke-virtual {v2, v1}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V
/* .line 5 */
} // :cond_1
v1 = this.b;
/* iget v2, p0, Lc/b/p/e;->a:I */
(( c.b.p.e ) p0 ).a ( v1, v2, v0 ); // invoke-virtual {p0, v1, v2, v0}, Lc/b/p/e;->a(Landroid/content/res/Resources$Theme;IZ)V
return;
} // .end method
public android.content.res.AssetManager getAssets ( ) {
/* .locals 1 */
/* .line 1 */
(( c.b.p.e ) p0 ).getResources ( ); // invoke-virtual {p0}, Lc/b/p/e;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
} // .end method
public android.content.res.Resources getResources ( ) {
/* .locals 1 */
/* .line 1 */
(( c.b.p.e ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/p/e;->a()Landroid/content/res/Resources;
} // .end method
public java.lang.Object getSystemService ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "layout_inflater"; // const-string v0, "layout_inflater"
/* .line 1 */
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
p1 = this.c;
/* if-nez p1, :cond_0 */
/* .line 3 */
(( android.content.ContextWrapper ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
android.view.LayoutInflater .from ( p1 );
(( android.view.LayoutInflater ) p1 ).cloneInContext ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;
this.c = p1;
/* .line 4 */
} // :cond_0
p1 = this.c;
/* .line 5 */
} // :cond_1
(( android.content.ContextWrapper ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getSystemService ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
} // .end method
public android.content.res.Resources$Theme getTheme ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* iget v0, p0, Lc/b/p/e;->a:I */
/* if-nez v0, :cond_1 */
/* .line 3 */
/* iput v0, p0, Lc/b/p/e;->a:I */
/* .line 4 */
} // :cond_1
(( c.b.p.e ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/p/e;->c()V
/* .line 5 */
v0 = this.b;
} // .end method
public void setTheme ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/p/e;->a:I */
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
/* iput p1, p0, Lc/b/p/e;->a:I */
/* .line 3 */
(( c.b.p.e ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/p/e;->c()V
} // :cond_0
return;
} // .end method
