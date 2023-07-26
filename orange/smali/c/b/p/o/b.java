public abstract class c.b.p.o.b implements c.b.p.o.z {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public android.content.Context b;
	 public android.content.Context c;
	 public c.b.p.o.m d;
	 public android.view.LayoutInflater e;
	 public c.b.p.o.z$a f;
	 public Integer g;
	 public Integer h;
	 public c.b.p.o.a0 i;
	 /* # direct methods */
	 public c.b.p.o.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 android.view.LayoutInflater .from ( p1 );
		 this.e = p1;
		 /* .line 4 */
		 /* iput p2, p0, Lc/b/p/o/b;->g:I */
		 /* .line 5 */
		 /* iput p3, p0, Lc/b/p/o/b;->h:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View a ( Object p0, android.view.View p1, android.view.ViewGroup p2 ) {
		 /* .locals 1 */
		 /* .line 27 */
		 /* instance-of v0, p2, Lc/b/p/o/a0$a; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 28 */
			 /* check-cast p2, Lc/b/p/o/a0$a; */
			 /* .line 29 */
		 } // :cond_0
		 (( c.b.p.o.b ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Lc/b/p/o/b;->a(Landroid/view/ViewGroup;)Lc/b/p/o/a0$a;
		 /* .line 30 */
	 } // :goto_0
	 (( c.b.p.o.b ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/p/o/b;->a(Lc/b/p/o/p;Lc/b/p/o/a0$a;)V
	 /* .line 31 */
	 /* check-cast p2, Landroid/view/View; */
} // .end method
public c.b.p.o.a0$a a ( android.view.ViewGroup p0 ) {
	 /* .locals 3 */
	 /* .line 26 */
	 v0 = this.e;
	 /* iget v1, p0, Lc/b/p/o/b;->h:I */
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p1, v2 ); // invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
	 /* check-cast p1, Lc/b/p/o/a0$a; */
} // .end method
public c.b.p.o.z$a a ( ) {
	 /* .locals 1 */
	 /* .line 25 */
	 v0 = this.f;
} // .end method
public void a ( Integer p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void a ( android.content.Context p0, Object p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.c = p1;
	 /* .line 2 */
	 android.view.LayoutInflater .from ( p1 );
	 /* .line 3 */
	 this.d = p2;
	 return;
} // .end method
public void a ( android.view.View p0, Integer p1 ) {
	 /* .locals 1 */
	 /* .line 20 */
	 (( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
	 /* check-cast v0, Landroid/view/ViewGroup; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 21 */
		 (( android.view.ViewGroup ) v0 ).removeView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
		 /* .line 22 */
	 } // :cond_0
	 v0 = this.i;
	 /* check-cast v0, Landroid/view/ViewGroup; */
	 (( android.view.ViewGroup ) v0 ).addView ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V
	 return;
} // .end method
public void a ( Object p0, Boolean p1 ) {
	 /* .locals 1 */
	 /* .line 32 */
	 v0 = this.f;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 33 */
	 } // :cond_0
	 return;
} // .end method
public abstract void a ( Object p0, c.b.p.o.a0$a p1 ) {
} // .end method
public void a ( c.b.p.o.z$a p0 ) {
	 /* .locals 0 */
	 /* .line 24 */
	 this.f = p1;
	 return;
} // .end method
public void a ( Boolean p0 ) {
	 /* .locals 9 */
	 /* .line 4 */
	 p1 = this.i;
	 /* check-cast p1, Landroid/view/ViewGroup; */
	 /* if-nez p1, :cond_0 */
	 return;
	 /* .line 5 */
} // :cond_0
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_6
	 /* .line 6 */
	 (( c.b.p.o.m ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->b()V
	 /* .line 7 */
	 v0 = this.d;
	 (( c.b.p.o.m ) v0 ).n ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->n()Ljava/util/ArrayList;
	 /* .line 8 */
	 v2 = 	 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_5 */
/* .line 9 */
(( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Lc/b/p/o/p; */
/* .line 10 */
v6 = (( c.b.p.o.b ) p0 ).a ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lc/b/p/o/b;->a(ILc/b/p/o/p;)Z
if ( v6 != null) { // if-eqz v6, :cond_4
	 /* .line 11 */
	 (( android.view.ViewGroup ) p1 ).getChildAt ( v4 ); // invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
	 /* .line 12 */
	 /* instance-of v7, v6, Lc/b/p/o/a0$a; */
	 if ( v7 != null) { // if-eqz v7, :cond_1
		 /* move-object v7, v6 */
		 /* check-cast v7, Lc/b/p/o/a0$a; */
		 /* .line 13 */
	 } // :cond_1
	 int v7 = 0; // const/4 v7, 0x0
	 /* .line 14 */
} // :goto_1
(( c.b.p.o.b ) p0 ).a ( v5, v6, p1 ); // invoke-virtual {p0, v5, v6, p1}, Lc/b/p/o/b;->a(Lc/b/p/o/p;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
/* if-eq v5, v7, :cond_2 */
/* .line 15 */
(( android.view.View ) v8 ).setPressed ( v1 ); // invoke-virtual {v8, v1}, Landroid/view/View;->setPressed(Z)V
/* .line 16 */
(( android.view.View ) v8 ).jumpDrawablesToCurrentState ( ); // invoke-virtual {v8}, Landroid/view/View;->jumpDrawablesToCurrentState()V
} // :cond_2
/* if-eq v8, v6, :cond_3 */
/* .line 17 */
(( c.b.p.o.b ) p0 ).a ( v8, v4 ); // invoke-virtual {p0, v8, v4}, Lc/b/p/o/b;->a(Landroid/view/View;I)V
} // :cond_3
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_4
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_5
/* move v1, v4 */
/* .line 18 */
} // :cond_6
} // :goto_2
v0 = (( android.view.ViewGroup ) p1 ).getChildCount ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge v1, v0, :cond_7 */
/* .line 19 */
v0 = (( c.b.p.o.b ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lc/b/p/o/b;->a(Landroid/view/ViewGroup;I)Z
/* if-nez v0, :cond_6 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_7
return;
} // .end method
public abstract Boolean a ( Integer p0, Object p1 ) {
} // .end method
public Boolean a ( android.view.ViewGroup p0, Integer p1 ) {
/* .locals 0 */
/* .line 23 */
(( android.view.ViewGroup ) p1 ).removeViewAt ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeViewAt(I)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( c.b.p.o.g0 p0 ) {
/* .locals 1 */
/* .line 34 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = /* .line 35 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean a ( Object p0, Object p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public c.b.p.o.a0 b ( android.view.ViewGroup p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.i;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.e;
/* iget v1, p0, Lc/b/p/o/b;->g:I */
int v2 = 0; // const/4 v2, 0x0
(( android.view.LayoutInflater ) v0 ).inflate ( v1, p1, v2 ); // invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* check-cast p1, Lc/b/p/o/a0; */
this.i = p1;
/* .line 3 */
v0 = this.d;
int p1 = 1; // const/4 p1, 0x1
/* .line 4 */
(( c.b.p.o.b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/b;->a(Z)V
/* .line 5 */
} // :cond_0
p1 = this.i;
} // .end method
public Boolean b ( Object p0, Object p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
