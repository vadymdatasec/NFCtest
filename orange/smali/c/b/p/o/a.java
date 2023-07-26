public class c.b.p.o.a implements c.h.h.a.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer a;
	 public final Integer b;
	 public final Integer c;
	 public java.lang.CharSequence d;
	 public java.lang.CharSequence e;
	 public android.content.Intent f;
	 public Object g;
	 public Integer h;
	 public Object i;
	 public Integer j;
	 public android.graphics.drawable.Drawable k;
	 public android.content.Context l;
	 public java.lang.CharSequence m;
	 public java.lang.CharSequence n;
	 public android.content.res.ColorStateList o;
	 public android.graphics.PorterDuff$Mode p;
	 public Boolean q;
	 public Boolean r;
	 public Integer s;
	 /* # direct methods */
	 public c.b.p.o.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/16 p4, 0x1000 */
		 /* .line 2 */
		 /* iput p4, p0, Lc/b/p/o/a;->h:I */
		 /* .line 3 */
		 /* iput p4, p0, Lc/b/p/o/a;->j:I */
		 int p4 = 0; // const/4 p4, 0x0
		 /* .line 4 */
		 this.o = p4;
		 /* .line 5 */
		 this.p = p4;
		 int p4 = 0; // const/4 p4, 0x0
		 /* .line 6 */
		 /* iput-boolean p4, p0, Lc/b/p/o/a;->q:Z */
		 /* .line 7 */
		 /* iput-boolean p4, p0, Lc/b/p/o/a;->r:Z */
		 /* const/16 p4, 0x10 */
		 /* .line 8 */
		 /* iput p4, p0, Lc/b/p/o/a;->s:I */
		 /* .line 9 */
		 this.l = p1;
		 /* .line 10 */
		 /* iput p3, p0, Lc/b/p/o/a;->a:I */
		 /* .line 11 */
		 /* iput p2, p0, Lc/b/p/o/a;->b:I */
		 /* .line 12 */
		 /* iput p5, p0, Lc/b/p/o/a;->c:I */
		 /* .line 13 */
		 this.d = p6;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public c.h.h.a.b a ( Object p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* new-instance p1, Ljava/lang/UnsupportedOperationException; */
		 /* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
		 /* throw p1 */
	 } // .end method
	 public c.h.n.g a ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public final void b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.k;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* iget-boolean v0, p0, Lc/b/p/o/a;->q:Z */
			 /* if-nez v0, :cond_0 */
			 /* iget-boolean v0, p0, Lc/b/p/o/a;->r:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 /* .line 2 */
			 } // :cond_0
			 v0 = this.k;
			 c.h.g.r.a .h ( v0 );
			 this.k = v0;
			 /* .line 3 */
			 (( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
			 this.k = v0;
			 /* .line 4 */
			 /* iget-boolean v1, p0, Lc/b/p/o/a;->q:Z */
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 /* .line 5 */
				 v1 = this.o;
				 c.h.g.r.a .a ( v0,v1 );
				 /* .line 6 */
			 } // :cond_1
			 /* iget-boolean v0, p0, Lc/b/p/o/a;->r:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 /* .line 7 */
				 v0 = this.k;
				 v1 = this.p;
				 c.h.g.r.a .a ( v0,v1 );
			 } // :cond_2
			 return;
		 } // .end method
		 public Boolean collapseActionView ( ) {
			 /* .locals 1 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public Boolean expandActionView ( ) {
			 /* .locals 1 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public android.view.ActionProvider getActionProvider ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* new-instance v0, Ljava/lang/UnsupportedOperationException; */
			 /* invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V */
			 /* throw v0 */
		 } // .end method
		 public android.view.View getActionView ( ) {
			 /* .locals 1 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public Integer getAlphabeticModifiers ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget v0, p0, Lc/b/p/o/a;->j:I */
		 } // .end method
		 public Object getAlphabeticShortcut ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget-char v0, p0, Lc/b/p/o/a;->i:C */
		 } // .end method
		 public java.lang.CharSequence getContentDescription ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.m;
		 } // .end method
		 public Integer getGroupId ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget v0, p0, Lc/b/p/o/a;->b:I */
		 } // .end method
		 public android.graphics.drawable.Drawable getIcon ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.k;
		 } // .end method
		 public android.content.res.ColorStateList getIconTintList ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.o;
		 } // .end method
		 public android.graphics.PorterDuff$Mode getIconTintMode ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.p;
		 } // .end method
		 public android.content.Intent getIntent ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.f;
		 } // .end method
		 public Integer getItemId ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget v0, p0, Lc/b/p/o/a;->a:I */
		 } // .end method
		 public android.view.ContextMenu$ContextMenuInfo getMenuInfo ( ) {
			 /* .locals 1 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public Integer getNumericModifiers ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget v0, p0, Lc/b/p/o/a;->h:I */
		 } // .end method
		 public Object getNumericShortcut ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget-char v0, p0, Lc/b/p/o/a;->g:C */
		 } // .end method
		 public Integer getOrder ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget v0, p0, Lc/b/p/o/a;->c:I */
		 } // .end method
		 public android.view.SubMenu getSubMenu ( ) {
			 /* .locals 1 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public java.lang.CharSequence getTitle ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.d;
		 } // .end method
		 public java.lang.CharSequence getTitleCondensed ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.e;
			 if ( v0 != null) { // if-eqz v0, :cond_0
			 } // :cond_0
			 v0 = this.d;
		 } // :goto_0
	 } // .end method
	 public java.lang.CharSequence getTooltipText ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.n;
	 } // .end method
	 public Boolean hasSubMenu ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public Boolean isActionViewExpanded ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public Boolean isCheckable ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget v0, p0, Lc/b/p/o/a;->s:I */
		 int v1 = 1; // const/4 v1, 0x1
		 /* and-int/2addr v0, v1 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
} // .end method
public Boolean isChecked ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Lc/b/p/o/a;->s:I */
	 /* and-int/lit8 v0, v0, 0x2 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean isEnabled ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/p/o/a;->s:I */
/* and-int/lit8 v0, v0, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean isVisible ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/p/o/a;->s:I */
/* and-int/lit8 v0, v0, 0x8 */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.view.MenuItem setActionProvider ( android.view.ActionProvider p0 ) {
/* .locals 0 */
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public android.view.MenuItem setActionView ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( c.b.p.o.a ) p0 ).setActionView ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/a;->setActionView(I)Lc/h/h/a/b;
int p1 = 0; // const/4 p1, 0x0
/* throw p1 */
} // .end method
public android.view.MenuItem setActionView ( android.view.View p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
(( c.b.p.o.a ) p0 ).setActionView ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/a;->setActionView(Landroid/view/View;)Lc/h/h/a/b;
int p1 = 0; // const/4 p1, 0x0
/* throw p1 */
} // .end method
public c.h.h.a.b setActionView ( Integer p0 ) {
/* .locals 0 */
/* .line 4 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public c.h.h.a.b setActionView ( android.view.View p0 ) {
/* .locals 0 */
/* .line 3 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public android.view.MenuItem setAlphabeticShortcut ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = java.lang.Character .toLowerCase ( p1 );
/* iput-char p1, p0, Lc/b/p/o/a;->i:C */
} // .end method
public android.view.MenuItem setAlphabeticShortcut ( Object p0, Integer p1 ) {
/* .locals 0 */
/* .line 2 */
p1 = java.lang.Character .toLowerCase ( p1 );
/* iput-char p1, p0, Lc/b/p/o/a;->i:C */
/* .line 3 */
p1 = android.view.KeyEvent .normalizeMetaState ( p2 );
/* iput p1, p0, Lc/b/p/o/a;->j:I */
} // .end method
public android.view.MenuItem setCheckable ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/p/o/a;->s:I */
/* and-int/lit8 v0, v0, -0x2 */
/* or-int/2addr p1, v0 */
/* iput p1, p0, Lc/b/p/o/a;->s:I */
} // .end method
public android.view.MenuItem setChecked ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/p/o/a;->s:I */
/* and-int/lit8 v0, v0, -0x3 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 2; // const/4 p1, 0x2
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* or-int/2addr p1, v0 */
/* iput p1, p0, Lc/b/p/o/a;->s:I */
} // .end method
public android.view.MenuItem setContentDescription ( java.lang.CharSequence p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( c.b.p.o.a ) p0 ).setContentDescription ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/a;->setContentDescription(Ljava/lang/CharSequence;)Lc/h/h/a/b;
} // .end method
public c.h.h.a.b setContentDescription ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 2 */
this.m = p1;
} // .end method
public android.view.MenuItem setEnabled ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/p/o/a;->s:I */
/* and-int/lit8 v0, v0, -0x11 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* const/16 p1, 0x10 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* or-int/2addr p1, v0 */
/* iput p1, p0, Lc/b/p/o/a;->s:I */
} // .end method
public android.view.MenuItem setIcon ( Integer p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.l;
c.h.f.f .c ( v0,p1 );
this.k = p1;
/* .line 4 */
(( c.b.p.o.a ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/p/o/a;->b()V
} // .end method
public android.view.MenuItem setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
this.k = p1;
/* .line 2 */
(( c.b.p.o.a ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/p/o/a;->b()V
} // .end method
public android.view.MenuItem setIconTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 0 */
/* .line 1 */
this.o = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Lc/b/p/o/a;->q:Z */
/* .line 3 */
(( c.b.p.o.a ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/p/o/a;->b()V
} // .end method
public android.view.MenuItem setIconTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 0 */
/* .line 1 */
this.p = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Lc/b/p/o/a;->r:Z */
/* .line 3 */
(( c.b.p.o.a ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/p/o/a;->b()V
} // .end method
public android.view.MenuItem setIntent ( android.content.Intent p0 ) {
/* .locals 0 */
/* .line 1 */
this.f = p1;
} // .end method
public android.view.MenuItem setNumericShortcut ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-char p1, p0, Lc/b/p/o/a;->g:C */
} // .end method
public android.view.MenuItem setNumericShortcut ( Object p0, Integer p1 ) {
/* .locals 0 */
/* .line 2 */
/* iput-char p1, p0, Lc/b/p/o/a;->g:C */
/* .line 3 */
p1 = android.view.KeyEvent .normalizeMetaState ( p2 );
/* iput p1, p0, Lc/b/p/o/a;->h:I */
} // .end method
public android.view.MenuItem setOnActionExpandListener ( android.view.MenuItem$OnActionExpandListener p0 ) {
/* .locals 0 */
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public android.view.MenuItem setOnMenuItemClickListener ( android.view.MenuItem$OnMenuItemClickListener p0 ) {
/* .locals 0 */
} // .end method
public android.view.MenuItem setShortcut ( Object p0, Object p1 ) {
/* .locals 0 */
/* .line 1 */
/* iput-char p1, p0, Lc/b/p/o/a;->g:C */
/* .line 2 */
p1 = java.lang.Character .toLowerCase ( p2 );
/* iput-char p1, p0, Lc/b/p/o/a;->i:C */
} // .end method
public android.view.MenuItem setShortcut ( Object p0, Object p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 3 */
/* iput-char p1, p0, Lc/b/p/o/a;->g:C */
/* .line 4 */
p1 = android.view.KeyEvent .normalizeMetaState ( p3 );
/* iput p1, p0, Lc/b/p/o/a;->h:I */
/* .line 5 */
p1 = java.lang.Character .toLowerCase ( p2 );
/* iput-char p1, p0, Lc/b/p/o/a;->i:C */
/* .line 6 */
p1 = android.view.KeyEvent .normalizeMetaState ( p4 );
/* iput p1, p0, Lc/b/p/o/a;->j:I */
} // .end method
public void setShowAsAction ( Integer p0 ) {
/* .locals 0 */
return;
} // .end method
public android.view.MenuItem setShowAsActionFlags ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( c.b.p.o.a ) p0 ).setShowAsActionFlags ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/a;->setShowAsActionFlags(I)Lc/h/h/a/b;
} // .end method
public c.h.h.a.b setShowAsActionFlags ( Integer p0 ) {
/* .locals 0 */
/* .line 2 */
(( c.b.p.o.a ) p0 ).setShowAsAction ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/a;->setShowAsAction(I)V
} // .end method
public android.view.MenuItem setTitle ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.l;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
this.d = p1;
} // .end method
public android.view.MenuItem setTitle ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
} // .end method
public android.view.MenuItem setTitleCondensed ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
this.e = p1;
} // .end method
public android.view.MenuItem setTooltipText ( java.lang.CharSequence p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( c.b.p.o.a ) p0 ).setTooltipText ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/a;->setTooltipText(Ljava/lang/CharSequence;)Lc/h/h/a/b;
} // .end method
public c.h.h.a.b setTooltipText ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 2 */
this.n = p1;
} // .end method
public android.view.MenuItem setVisible ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/b/p/o/a;->s:I */
/* const/16 v1, 0x8 */
/* and-int/2addr v0, v1 */
if ( p1 != null) { // if-eqz p1, :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :cond_0
/* or-int p1, v0, v1 */
/* iput p1, p0, Lc/b/p/o/a;->s:I */
} // .end method
