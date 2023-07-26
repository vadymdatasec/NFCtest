public class e.f.a.c.j.c extends android.util.Property {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/util/Property<", */
	 /* "Landroid/view/ViewGroup;", */
	 /* "Ljava/lang/Float;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final android.util.Property a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/Property<", */
/* "Landroid/view/ViewGroup;", */
/* "Ljava/lang/Float;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.a.c.j.c ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Le/f/a/c/j/c; */
final String v1 = "childrenAlpha"; // const-string v1, "childrenAlpha"
/* invoke-direct {v0, v1}, Le/f/a/c/j/c;-><init>(Ljava/lang/String;)V */
return;
} // .end method
public e.f.a.c.j.c ( ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Ljava/lang/Float; */
/* invoke-direct {p0, v0, p1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.Float a ( android.view.ViewGroup p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.ViewGroup ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Float; */
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
/* const/high16 p1, 0x3f800000 # 1.0f */
/* .line 2 */
java.lang.Float .valueOf ( p1 );
} // .end method
public void a ( android.view.ViewGroup p0, java.lang.Float p1 ) {
/* .locals 3 */
/* .line 3 */
p2 = (( java.lang.Float ) p2 ).floatValue ( ); // invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F
/* .line 4 */
java.lang.Float .valueOf ( p2 );
(( android.view.ViewGroup ) p1 ).setTag ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V
/* .line 5 */
v0 = (( android.view.ViewGroup ) p1 ).getChildCount ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 6 */
(( android.view.ViewGroup ) p1 ).getChildAt ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 7 */
(( android.view.View ) v2 ).setAlpha ( p2 ); // invoke-virtual {v2, p2}, Landroid/view/View;->setAlpha(F)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public java.lang.Object get ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/view/ViewGroup; */
(( e.f.a.c.j.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/j/c;->a(Landroid/view/ViewGroup;)Ljava/lang/Float;
} // .end method
public void set ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/view/ViewGroup; */
/* check-cast p2, Ljava/lang/Float; */
(( e.f.a.c.j.c ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/c/j/c;->a(Landroid/view/ViewGroup;Ljava/lang/Float;)V
return;
} // .end method
