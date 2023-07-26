public abstract class c.f.b.b extends android.view.View {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public b;
	 public Integer c;
	 public android.content.Context d;
	 public c.f.a.l.n e;
	 public Boolean f;
	 public java.lang.String g;
	 /* # direct methods */
	 public c.f.b.b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
		 /* const/16 v0, 0x20 */
		 /* new-array v0, v0, [I */
		 /* .line 2 */
		 this.b = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lc/f/b/b;->f:Z */
		 /* .line 4 */
		 this.d = p1;
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 5 */
		 (( c.f.b.b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/f/b/b;->a(Landroid/util/AttributeSet;)V
		 return;
	 } // .end method
	 private void setIds ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* if-nez p1, :cond_0 */
		 return;
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* const/16 v1, 0x2c */
/* .line 1 */
v1 = (( java.lang.String ) p1 ).indexOf ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I
int v2 = -1; // const/4 v2, -0x1
/* if-ne v1, v2, :cond_1 */
/* .line 2 */
(( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( c.f.b.b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/f/b/b;->a(Ljava/lang/String;)V
return;
/* .line 3 */
} // :cond_1
(( java.lang.String ) p1 ).substring ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( c.f.b.b ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/f/b/b;->a(Ljava/lang/String;)V
/* add-int/lit8 v0, v1, 0x1 */
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 7 */
v0 = this.e;
/* if-nez v0, :cond_0 */
return;
/* .line 8 */
} // :cond_0
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 9 */
/* instance-of v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 10 */
/* check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a; */
/* .line 11 */
v1 = this.e;
this.k0 = v1;
} // :cond_1
return;
} // .end method
public void a ( android.util.AttributeSet p0 ) {
/* .locals 4 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 1 */
(( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
v1 = c.f.b.h.ConstraintLayout_Layout;
(( android.content.Context ) v0 ).obtainStyledAttributes ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 2 */
v0 = (( android.content.res.TypedArray ) p1 ).getIndexCount ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 3 */
v2 = (( android.content.res.TypedArray ) p1 ).getIndex ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I
/* .line 4 */
/* if-ne v2, v3, :cond_0 */
/* .line 5 */
(( android.content.res.TypedArray ) p1 ).getString ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
this.g = v2;
/* .line 6 */
/* invoke-direct {p0, v2}, Lc/f/b/b;->setIds(Ljava/lang/String;)V */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void a ( androidx.constraintlayout.widget.ConstraintLayout p0 ) {
/* .locals 0 */
return;
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 5 */
/* if-nez p1, :cond_0 */
return;
/* .line 12 */
} // :cond_0
v0 = this.d;
/* if-nez v0, :cond_1 */
return;
/* .line 13 */
} // :cond_1
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 14 */
try { // :try_start_0
/* const-class v2, Lc/f/b/g; */
/* .line 15 */
(( java.lang.Class ) v2 ).getField ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 16 */
v2 = (( java.lang.reflect.Field ) v2 ).getInt ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-nez v2, :cond_2 */
/* .line 17 */
v2 = this.d;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v3 = this.d;
/* .line 18 */
(( android.content.Context ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String v4 = "id"; // const-string v4, "id"
/* .line 19 */
v2 = (( android.content.res.Resources ) v2 ).getIdentifier ( p1, v4, v3 ); // invoke-virtual {v2, p1, v4, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
} // :cond_2
/* if-nez v2, :cond_3 */
/* .line 20 */
v3 = (( android.view.View ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z
if ( v3 != null) { // if-eqz v3, :cond_3
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* instance-of v3, v3, Landroidx/constraintlayout/widget/ConstraintLayout; */
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 21 */
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout; */
/* .line 22 */
(( androidx.constraintlayout.widget.ConstraintLayout ) v3 ).a ( v1, p1 ); // invoke-virtual {v3, v1, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(ILjava/lang/Object;)Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 23 */
/* instance-of v3, v1, Ljava/lang/Integer; */
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 24 */
/* check-cast v1, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
} // :cond_3
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 25 */
(( c.f.b.b ) p0 ).setTag ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lc/f/b/b;->setTag(ILjava/lang/Object;)V
/* .line 26 */
} // :cond_4
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Could not find id of \""; // const-string v1, "Could not find id of \""
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "\""; // const-string p1, "\""
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "ConstraintHelper"; // const-string v0, "ConstraintHelper"
android.util.Log .w ( v0,p1 );
} // :goto_1
return;
} // .end method
public void b ( androidx.constraintlayout.widget.ConstraintLayout p0 ) {
/* .locals 0 */
return;
} // .end method
public void c ( androidx.constraintlayout.widget.ConstraintLayout p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = (( android.view.View ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.g;
/* invoke-direct {p0, v0}, Lc/f/b/b;->setIds(Ljava/lang/String;)V */
/* .line 3 */
} // :cond_0
v0 = this.e;
/* if-nez v0, :cond_1 */
return;
/* .line 4 */
} // :cond_1
(( c.f.a.l.n ) v0 ).K ( ); // invoke-virtual {v0}, Lc/f/a/l/n;->K()V
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
} // :goto_0
/* iget v1, p0, Lc/f/b/b;->c:I */
/* if-ge v0, v1, :cond_3 */
/* .line 6 */
v1 = this.b;
/* aget v1, v1, v0 */
/* .line 7 */
(( androidx.constraintlayout.widget.ConstraintLayout ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(I)Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 8 */
v2 = this.e;
(( androidx.constraintlayout.widget.ConstraintLayout ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/view/View;)Lc/f/a/l/i;
(( c.f.a.l.n ) v2 ).b ( v1 ); // invoke-virtual {v2, v1}, Lc/f/a/l/n;->b(Lc/f/a/l/i;)V
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
return;
} // .end method
public getReferencedIds ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
/* iget v1, p0, Lc/f/b/b;->c:I */
java.util.Arrays .copyOf ( v0,v1 );
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 0 */
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/f/b/b;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
(( android.view.View ) p0 ).setMeasuredDimension ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V
} // :goto_0
return;
} // .end method
public void setReferencedIds ( Integer[] p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput v0, p0, Lc/f/b/b;->c:I */
/* .line 2 */
} // :goto_0
/* array-length v1, p1 */
/* if-ge v0, v1, :cond_0 */
/* .line 3 */
/* aget v1, p1, v0 */
int v2 = 0; // const/4 v2, 0x0
(( c.f.b.b ) p0 ).setTag ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lc/f/b/b;->setTag(ILjava/lang/Object;)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void setTag ( Integer p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .line 1 */
/* iget p2, p0, Lc/f/b/b;->c:I */
/* add-int/lit8 p2, p2, 0x1 */
v0 = this.b;
/* array-length v1, v0 */
/* if-le p2, v1, :cond_0 */
/* .line 2 */
/* array-length p2, v0 */
/* mul-int/lit8 p2, p2, 0x2 */
java.util.Arrays .copyOf ( v0,p2 );
this.b = p2;
/* .line 3 */
} // :cond_0
p2 = this.b;
/* iget v0, p0, Lc/f/b/b;->c:I */
/* aput p1, p2, v0 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 4 */
/* iput v0, p0, Lc/f/b/b;->c:I */
return;
} // .end method
