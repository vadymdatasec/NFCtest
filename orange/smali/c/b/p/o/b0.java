public class c.b.p.o.b0 extends c.b.p.o.c implements android.view.Menu {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.h.h.a.a d;
	 /* # direct methods */
	 public c.b.p.o.b0 ( ) {
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
	 public android.view.MenuItem add ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = this.d;
		 (( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
	 } // .end method
	 public android.view.MenuItem add ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* .line 4 */
		 v0 = this.d;
		 (( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
	 } // .end method
	 public android.view.MenuItem add ( Integer p0, Integer p1, Integer p2, java.lang.CharSequence p3 ) {
		 /* .locals 1 */
		 /* .line 3 */
		 v0 = this.d;
		 (( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
	 } // .end method
	 public android.view.MenuItem add ( java.lang.CharSequence p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.d;
		 (( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
	 } // .end method
	 public Integer addIntentOptions ( Integer p0, Integer p1, Integer p2, android.content.ComponentName p3, android.content.Intent[] p4, android.content.Intent p5, Integer p6, android.view.MenuItem[] p7 ) {
		 /* .locals 12 */
		 /* move-object v0, p0 */
		 /* move-object/from16 v1, p8 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 1 */
			 /* array-length v2, v1 */
			 /* new-array v2, v2, [Landroid/view/MenuItem; */
		 } // :cond_0
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 2 */
	 } // :goto_0
	 v3 = this.d;
	 /* move v4, p1 */
	 /* move v5, p2 */
	 /* move v6, p3 */
	 /* move-object/from16 v7, p4 */
	 /* move-object/from16 v8, p5 */
	 /* move-object/from16 v9, p6 */
	 /* move/from16 v10, p7 */
	 /* move-object v11, v2 */
	 /* .line 3 */
	 v3 = 	 /* invoke-interface/range {v3 ..v11}, Landroid/view/Menu;->addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I */
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 4 */
		 /* array-length v5, v2 */
	 } // :goto_1
	 /* if-ge v4, v5, :cond_1 */
	 /* .line 5 */
	 /* aget-object v6, v2, v4 */
	 (( c.b.p.o.c ) p0 ).a ( v6 ); // invoke-virtual {p0, v6}, Lc/b/p/o/c;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
	 /* aput-object v6, v1, v4 */
	 /* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
} // .end method
public android.view.SubMenu addSubMenu ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
(( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
} // .end method
public android.view.SubMenu addSubMenu ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.d;
/* .line 5 */
/* .line 6 */
(( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
} // .end method
public android.view.SubMenu addSubMenu ( Integer p0, Integer p1, Integer p2, java.lang.CharSequence p3 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.d;
(( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
} // .end method
public android.view.SubMenu addSubMenu ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
(( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
} // .end method
public void clear ( ) {
/* .locals 1 */
/* .line 1 */
(( c.b.p.o.c ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/p/o/c;->b()V
/* .line 2 */
v0 = this.d;
return;
} // .end method
public void close ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
return;
} // .end method
public android.view.MenuItem findItem ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
(( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
} // .end method
public android.view.MenuItem getItem ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
(( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
} // .end method
public Boolean hasVisibleItems ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.d;
} // .end method
public Boolean isShortcutKey ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .line 1 */
p1 = v0 = this.d;
} // .end method
public Boolean performIdentifierAction ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
p1 = v0 = this.d;
} // .end method
public Boolean performShortcut ( Integer p0, android.view.KeyEvent p1, Integer p2 ) {
/* .locals 1 */
/* .line 1 */
p1 = v0 = this.d;
} // .end method
public void removeGroup ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( c.b.p.o.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->a(I)V
/* .line 2 */
v0 = this.d;
return;
} // .end method
public void removeItem ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( c.b.p.o.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/c;->b(I)V
/* .line 2 */
v0 = this.d;
return;
} // .end method
public void setGroupCheckable ( Integer p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
return;
} // .end method
public void setGroupEnabled ( Integer p0, Boolean p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
return;
} // .end method
public void setGroupVisible ( Integer p0, Boolean p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
return;
} // .end method
public void setQwertyMode ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
return;
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.d;
} // .end method
