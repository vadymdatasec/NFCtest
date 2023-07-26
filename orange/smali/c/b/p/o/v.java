public class c.b.p.o.v extends c.b.p.o.c implements android.view.MenuItem {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.h.h.a.b d;
	 public java.lang.reflect.Method e;
	 /* # direct methods */
	 public c.b.p.o.v ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Lc/b/p/o/c;-><init>(Landroid/content/Context;)V */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 2 */
			 this.d = p2;
			 return;
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String p2 = "Wrapped Object can not be null."; // const-string p2, "Wrapped Object can not be null."
		 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 /* # virtual methods */
	 public void a ( Boolean p0 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.e;
			 int v1 = 0; // const/4 v1, 0x0
			 int v2 = 1; // const/4 v2, 0x1
			 /* if-nez v0, :cond_0 */
			 /* .line 2 */
			 v0 = this.d;
			 (( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
			 final String v3 = "setExclusiveCheckable"; // const-string v3, "setExclusiveCheckable"
			 /* new-array v4, v2, [Ljava/lang/Class; */
			 v5 = java.lang.Boolean.TYPE;
			 /* aput-object v5, v4, v1 */
			 /* .line 3 */
			 (( java.lang.Class ) v0 ).getDeclaredMethod ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 this.e = v0;
			 /* .line 4 */
		 } // :cond_0
		 v0 = this.e;
		 v3 = this.d;
		 /* new-array v2, v2, [Ljava/lang/Object; */
		 java.lang.Boolean .valueOf ( p1 );
		 /* aput-object p1, v2, v1 */
		 (( java.lang.reflect.Method ) v0 ).invoke ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p1 */
		 final String v0 = "MenuItemWrapper"; // const-string v0, "MenuItemWrapper"
		 final String v1 = "Error while calling setExclusiveCheckable"; // const-string v1, "Error while calling setExclusiveCheckable"
		 /* .line 5 */
		 android.util.Log .w ( v0,v1,p1 );
	 } // :goto_0
	 return;
} // .end method
public Boolean collapseActionView ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public Boolean expandActionView ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public android.view.ActionProvider getActionProvider ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.d;
	 /* .line 2 */
	 /* instance-of v1, v0, Lc/b/p/o/q; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 3 */
		 /* check-cast v0, Lc/b/p/o/q; */
		 v0 = this.b;
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.view.View getActionView ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.d;
	 /* .line 2 */
	 /* instance-of v1, v0, Lc/b/p/o/s; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 3 */
		 /* check-cast v0, Lc/b/p/o/s; */
		 (( c.b.p.o.s ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/p/o/s;->c()Landroid/view/View;
	 } // :cond_0
} // .end method
public Integer getAlphabeticModifiers ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public Object getAlphabeticShortcut ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public java.lang.CharSequence getContentDescription ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public Integer getGroupId ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public android.graphics.drawable.Drawable getIcon ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public android.content.res.ColorStateList getIconTintList ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public android.graphics.PorterDuff$Mode getIconTintMode ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public android.content.Intent getIntent ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public Integer getItemId ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public android.view.ContextMenu$ContextMenuInfo getMenuInfo ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public Integer getNumericModifiers ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public Object getNumericShortcut ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public Integer getOrder ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public android.view.SubMenu getSubMenu ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
	 (( c.b.p.o.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/p/o/c;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
} // .end method
public java.lang.CharSequence getTitle ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public java.lang.CharSequence getTitleCondensed ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public java.lang.CharSequence getTooltipText ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public Boolean hasSubMenu ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public Boolean isActionViewExpanded ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public Boolean isCheckable ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public Boolean isChecked ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public Boolean isEnabled ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public Boolean isVisible ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 v0 = this.d;
} // .end method
public android.view.MenuItem setActionProvider ( android.view.ActionProvider p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* const/16 v1, 0x10 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 2 */
	 /* new-instance v0, Lc/b/p/o/r; */
	 v1 = this.a;
	 /* invoke-direct {v0, p0, v1, p1}, Lc/b/p/o/r;-><init>(Lc/b/p/o/v;Landroid/content/Context;Landroid/view/ActionProvider;)V */
	 /* .line 3 */
} // :cond_0
/* new-instance v0, Lc/b/p/o/q; */
v1 = this.a;
/* invoke-direct {v0, p0, v1, p1}, Lc/b/p/o/q;-><init>(Lc/b/p/o/v;Landroid/content/Context;Landroid/view/ActionProvider;)V */
/* .line 4 */
} // :goto_0
v1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // .end method
public android.view.MenuItem setActionView ( Integer p0 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.d;
/* .line 5 */
p1 = this.d;
/* .line 6 */
/* instance-of v0, p1, Landroid/view/CollapsibleActionView; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 7 */
v0 = this.d;
/* new-instance v1, Lc/b/p/o/s; */
/* invoke-direct {v1, p1}, Lc/b/p/o/s;-><init>(Landroid/view/View;)V */
} // :cond_0
} // .end method
public android.view.MenuItem setActionView ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Landroid/view/CollapsibleActionView; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v0, Lc/b/p/o/s; */
/* invoke-direct {v0, p1}, Lc/b/p/o/s;-><init>(Landroid/view/View;)V */
/* move-object p1, v0 */
/* .line 3 */
} // :cond_0
v0 = this.d;
} // .end method
public android.view.MenuItem setAlphabeticShortcut ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setAlphabeticShortcut ( Object p0, Integer p1 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
} // .end method
public android.view.MenuItem setCheckable ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setChecked ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setContentDescription ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setEnabled ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setIcon ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
} // .end method
public android.view.MenuItem setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setIconTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setIconTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setIntent ( android.content.Intent p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setNumericShortcut ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setNumericShortcut ( Object p0, Integer p1 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
} // .end method
public android.view.MenuItem setOnActionExpandListener ( android.view.MenuItem$OnActionExpandListener p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_0
/* new-instance v1, Lc/b/p/o/t; */
/* invoke-direct {v1, p0, p1}, Lc/b/p/o/t;-><init>(Lc/b/p/o/v;Landroid/view/MenuItem$OnActionExpandListener;)V */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public android.view.MenuItem setOnMenuItemClickListener ( android.view.MenuItem$OnMenuItemClickListener p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_0
/* new-instance v1, Lc/b/p/o/u; */
/* invoke-direct {v1, p0, p1}, Lc/b/p/o/u;-><init>(Lc/b/p/o/v;Landroid/view/MenuItem$OnMenuItemClickListener;)V */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public android.view.MenuItem setShortcut ( Object p0, Object p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setShortcut ( Object p0, Object p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
} // .end method
public void setShowAsAction ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
return;
} // .end method
public android.view.MenuItem setShowAsActionFlags ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setTitle ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
} // .end method
public android.view.MenuItem setTitle ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setTitleCondensed ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setTooltipText ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.view.MenuItem setVisible ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
