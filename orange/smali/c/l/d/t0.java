public class c.l.d.t0 implements android.view.LayoutInflater$Factory2 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.l.d.o1 b;
	 /* # direct methods */
	 public c.l.d.t0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View onCreateView ( android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3 ) {
		 /* .locals 8 */
		 /* .line 2 */
		 /* const-class v0, Lc/l/d/o0; */
		 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 v0 = 		 (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 /* new-instance p1, Lc/l/d/o0; */
			 p2 = this.b;
			 /* invoke-direct {p1, p3, p4, p2}, Lc/l/d/o0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lc/l/d/o1;)V */
		 } // :cond_0
		 final String v0 = "fragment"; // const-string v0, "fragment"
		 /* .line 4 */
		 p2 = 		 (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-nez p2, :cond_1 */
	 } // :cond_1
	 final String p2 = "class"; // const-string p2, "class"
	 /* .line 5 */
	 /* .line 6 */
	 v1 = c.l.c.Fragment;
	 (( android.content.Context ) p3 ).obtainStyledAttributes ( p4, v1 ); // invoke-virtual {p3, p4, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
	 /* if-nez p2, :cond_2 */
	 /* .line 7 */
	 (( android.content.res.TypedArray ) v1 ).getString ( p2 ); // invoke-virtual {v1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
	 /* .line 8 */
} // :cond_2
int v3 = -1; // const/4 v3, -0x1
v2 = (( android.content.res.TypedArray ) v1 ).getResourceId ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 9 */
(( android.content.res.TypedArray ) v1 ).getString ( v4 ); // invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* .line 10 */
(( android.content.res.TypedArray ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
if ( p2 != null) { // if-eqz p2, :cond_11
	 /* .line 11 */
	 (( android.content.Context ) p3 ).getClassLoader ( ); // invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
	 v1 = 	 c.l.d.q0 .b ( v1,p2 );
	 /* if-nez v1, :cond_3 */
	 /* goto/16 :goto_4 */
} // :cond_3
if ( p1 != null) { // if-eqz p1, :cond_4
	 /* .line 12 */
	 v1 = 	 (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
} // :cond_4
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ne v1, v3, :cond_6 */
/* if-ne v2, v3, :cond_6 */
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 13 */
} // :cond_5
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p4 = ": Must specify unique android:id, android:tag, or have a parent with an id for "; // const-string p4, ": Must specify unique android:id, android:tag, or have a parent with an id for "
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_6
} // :goto_1
/* if-eq v2, v3, :cond_7 */
/* .line 14 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Lc/l/d/o1;->b(I)Landroidx/fragment/app/Fragment;
} // :cond_7
/* if-nez v0, :cond_8 */
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 15 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).c ( v4 ); // invoke-virtual {v0, v4}, Lc/l/d/o1;->c(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
} // :cond_8
/* if-nez v0, :cond_9 */
/* if-eq v1, v3, :cond_9 */
/* .line 16 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/o1;->b(I)Landroidx/fragment/app/Fragment;
} // :cond_9
final String v3 = "Fragment "; // const-string v3, "Fragment "
final String v5 = "FragmentManager"; // const-string v5, "FragmentManager"
int v6 = 2; // const/4 v6, 0x2
int v7 = 1; // const/4 v7, 0x1
/* if-nez v0, :cond_b */
/* .line 17 */
v0 = this.b;
(( c.l.d.o1 ) v0 ).x ( ); // invoke-virtual {v0}, Lc/l/d/o1;->x()Lc/l/d/q0;
/* .line 18 */
(( android.content.Context ) p3 ).getClassLoader ( ); // invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
/* .line 19 */
(( c.l.d.q0 ) v0 ).a ( p3, p2 ); // invoke-virtual {v0, p3, p2}, Lc/l/d/q0;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
/* .line 20 */
/* iput-boolean v7, v0, Landroidx/fragment/app/Fragment;->o:Z */
if ( v2 != null) { // if-eqz v2, :cond_a
/* move p3, v2 */
} // :cond_a
/* move p3, v1 */
/* .line 21 */
} // :goto_2
/* iput p3, v0, Landroidx/fragment/app/Fragment;->x:I */
/* .line 22 */
/* iput v1, v0, Landroidx/fragment/app/Fragment;->y:I */
/* .line 23 */
this.z = v4;
/* .line 24 */
/* iput-boolean v7, v0, Landroidx/fragment/app/Fragment;->p:Z */
/* .line 25 */
p3 = this.b;
this.t = p3;
/* .line 26 */
(( c.l.d.o1 ) p3 ).A ( ); // invoke-virtual {p3}, Lc/l/d/o1;->A()Lc/l/d/r0;
this.u = p3;
/* .line 27 */
p3 = this.b;
(( c.l.d.o1 ) p3 ).A ( ); // invoke-virtual {p3}, Lc/l/d/o1;->A()Lc/l/d/r0;
(( c.l.d.r0 ) p3 ).h ( ); // invoke-virtual {p3}, Lc/l/d/r0;->h()Landroid/content/Context;
v1 = this.c;
(( androidx.fragment.app.Fragment ) v0 ).a ( p3, p4, v1 ); // invoke-virtual {v0, p3, p4, v1}, Landroidx/fragment/app/Fragment;->a(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
/* .line 28 */
p3 = this.b;
(( c.l.d.o1 ) p3 ).a ( v0 ); // invoke-virtual {p3, v0}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;
/* .line 29 */
p4 = c.l.d.o1 .d ( v6 );
if ( p4 != null) { // if-eqz p4, :cond_c
/* .line 30 */
/* new-instance p4, Ljava/lang/StringBuilder; */
/* invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p4 ).append ( v3 ); // invoke-virtual {p4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( v0 ); // invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " has been inflated via the <fragment> tag: id=0x"; // const-string v1, " has been inflated via the <fragment> tag: id=0x"
(( java.lang.StringBuilder ) p4 ).append ( v1 ); // invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 31 */
java.lang.Integer .toHexString ( v2 );
(( java.lang.StringBuilder ) p4 ).append ( v1 ); // invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).toString ( ); // invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 32 */
android.util.Log .v ( v5,p4 );
/* .line 33 */
} // :cond_b
/* iget-boolean p3, v0, Landroidx/fragment/app/Fragment;->p:Z */
/* if-nez p3, :cond_10 */
/* .line 34 */
/* iput-boolean v7, v0, Landroidx/fragment/app/Fragment;->p:Z */
/* .line 35 */
p3 = this.b;
this.t = p3;
/* .line 36 */
(( c.l.d.o1 ) p3 ).A ( ); // invoke-virtual {p3}, Lc/l/d/o1;->A()Lc/l/d/r0;
this.u = p3;
/* .line 37 */
p3 = this.b;
(( c.l.d.o1 ) p3 ).A ( ); // invoke-virtual {p3}, Lc/l/d/o1;->A()Lc/l/d/r0;
(( c.l.d.r0 ) p3 ).h ( ); // invoke-virtual {p3}, Lc/l/d/r0;->h()Landroid/content/Context;
v1 = this.c;
(( androidx.fragment.app.Fragment ) v0 ).a ( p3, p4, v1 ); // invoke-virtual {v0, p3, p4, v1}, Landroidx/fragment/app/Fragment;->a(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
/* .line 38 */
p3 = this.b;
(( c.l.d.o1 ) p3 ).e ( v0 ); // invoke-virtual {p3, v0}, Lc/l/d/o1;->e(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;
/* .line 39 */
p4 = c.l.d.o1 .d ( v6 );
if ( p4 != null) { // if-eqz p4, :cond_c
/* .line 40 */
/* new-instance p4, Ljava/lang/StringBuilder; */
/* invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Retained Fragment "; // const-string v1, "Retained Fragment "
(( java.lang.StringBuilder ) p4 ).append ( v1 ); // invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( v0 ); // invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " has been re-attached via the <fragment> tag: id=0x"; // const-string v1, " has been re-attached via the <fragment> tag: id=0x"
(( java.lang.StringBuilder ) p4 ).append ( v1 ); // invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 41 */
java.lang.Integer .toHexString ( v2 );
(( java.lang.StringBuilder ) p4 ).append ( v1 ); // invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).toString ( ); // invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 42 */
android.util.Log .v ( v5,p4 );
/* .line 43 */
} // :cond_c
} // :goto_3
/* check-cast p1, Landroid/view/ViewGroup; */
this.H = p1;
/* .line 44 */
(( c.l.d.a2 ) p3 ).l ( ); // invoke-virtual {p3}, Lc/l/d/a2;->l()V
/* .line 45 */
(( c.l.d.a2 ) p3 ).j ( ); // invoke-virtual {p3}, Lc/l/d/a2;->j()V
/* .line 46 */
p1 = this.I;
if ( p1 != null) { // if-eqz p1, :cond_f
if ( v2 != null) { // if-eqz v2, :cond_d
/* .line 47 */
(( android.view.View ) p1 ).setId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/View;->setId(I)V
/* .line 48 */
} // :cond_d
p1 = this.I;
(( android.view.View ) p1 ).getTag ( ); // invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
/* if-nez p1, :cond_e */
/* .line 49 */
p1 = this.I;
(( android.view.View ) p1 ).setTag ( v4 ); // invoke-virtual {p1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
/* .line 50 */
} // :cond_e
p1 = this.I;
/* new-instance p2, Lc/l/d/s0; */
/* invoke-direct {p2, p0, p3}, Lc/l/d/s0;-><init>(Lc/l/d/t0;Lc/l/d/a2;)V */
(( android.view.View ) p1 ).addOnAttachStateChangeListener ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
/* .line 51 */
p1 = this.I;
/* .line 52 */
} // :cond_f
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p3 ).append ( v3 ); // invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = " did not create a view."; // const-string p2, " did not create a view."
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 53 */
} // :cond_10
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p4 = ": Duplicate id 0x"; // const-string p4, ": Duplicate id 0x"
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 54 */
java.lang.Integer .toHexString ( v2 );
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p4 = ", tag "; // const-string p4, ", tag "
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( v4 ); // invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p4 = ", or parent id 0x"; // const-string p4, ", or parent id 0x"
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 55 */
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p4 = " with another fragment for "; // const-string p4, " with another fragment for "
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_11
} // :goto_4
} // .end method
public android.view.View onCreateView ( java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( c.l.d.t0 ) p0 ).onCreateView ( v0, p1, p2, p3 ); // invoke-virtual {p0, v0, p1, p2, p3}, Lc/l/d/t0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
} // .end method
