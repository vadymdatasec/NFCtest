public class androidx.appcompat.widget.SearchView extends androidx.appcompat.widget.LinearLayoutCompat implements c.b.p.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/appcompat/widget/SearchView$k;, */
	 /* Landroidx/appcompat/widget/SearchView$SearchAutoComplete;, */
	 /* Landroidx/appcompat/widget/SearchView$p;, */
	 /* Landroidx/appcompat/widget/SearchView$o;, */
	 /* Landroidx/appcompat/widget/SearchView$n;, */
	 /* Landroidx/appcompat/widget/SearchView$l;, */
	 /* Landroidx/appcompat/widget/SearchView$m; */
	 /* } */
} // .end annotation
/* # static fields */
public static final androidx.appcompat.widget.SearchView$k r0;
/* # instance fields */
public android.graphics.Rect A;
public android.graphics.Rect B;
public C;
public D;
public final android.widget.ImageView E;
public final android.graphics.drawable.Drawable F;
public final Integer G;
public final Integer H;
public final android.content.Intent I;
public final android.content.Intent J;
public final java.lang.CharSequence K;
public androidx.appcompat.widget.SearchView$m L;
public androidx.appcompat.widget.SearchView$l M;
public android.view.View$OnFocusChangeListener N;
public androidx.appcompat.widget.SearchView$n O;
public android.view.View$OnClickListener P;
public Boolean Q;
public Boolean R;
public c.i.a.c S;
public Boolean T;
public java.lang.CharSequence U;
public Boolean V;
public Boolean W;
public Integer a0;
public Boolean b0;
public java.lang.CharSequence c0;
public java.lang.CharSequence d0;
public Boolean e0;
public Integer f0;
public android.app.SearchableInfo g0;
public android.os.Bundle h0;
public final java.lang.Runnable i0;
public java.lang.Runnable j0;
public final java.util.WeakHashMap k0;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/WeakHashMap<", */
/* "Ljava/lang/String;", */
/* "Landroid/graphics/drawable/Drawable$ConstantState;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final android.view.View$OnClickListener l0;
public android.view.View$OnKeyListener m0;
public final android.widget.TextView$OnEditorActionListener n0;
public final android.widget.AdapterView$OnItemClickListener o0;
public final android.widget.AdapterView$OnItemSelectedListener p0;
public final androidx.appcompat.widget.SearchView$SearchAutoComplete q;
public android.text.TextWatcher q0;
public final android.view.View r;
public final android.view.View s;
public final android.view.View t;
public final android.widget.ImageView u;
public final android.widget.ImageView v;
public final android.widget.ImageView w;
public final android.widget.ImageView x;
public final android.view.View y;
public androidx.appcompat.widget.SearchView$p z;
/* # direct methods */
public static androidx.appcompat.widget.SearchView ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Landroidx/appcompat/widget/SearchView$k; */
/* invoke-direct {v0}, Landroidx/appcompat/widget/SearchView$k;-><init>()V */
return;
} // .end method
public androidx.appcompat.widget.SearchView ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public androidx.appcompat.widget.SearchView ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public androidx.appcompat.widget.SearchView ( ) {
/* .locals 3 */
/* .line 3 */
/* invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 4 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
this.A = v0;
/* .line 5 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
this.B = v0;
int v0 = 2; // const/4 v0, 0x2
/* new-array v1, v0, [I */
/* .line 6 */
this.C = v1;
/* new-array v0, v0, [I */
/* .line 7 */
this.D = v0;
/* .line 8 */
/* new-instance v0, Landroidx/appcompat/widget/SearchView$b; */
/* invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$b;-><init>(Landroidx/appcompat/widget/SearchView;)V */
this.i0 = v0;
/* .line 9 */
/* new-instance v0, Landroidx/appcompat/widget/SearchView$c; */
/* invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$c;-><init>(Landroidx/appcompat/widget/SearchView;)V */
this.j0 = v0;
/* .line 10 */
/* new-instance v0, Ljava/util/WeakHashMap; */
/* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
this.k0 = v0;
/* .line 11 */
/* new-instance v0, Landroidx/appcompat/widget/SearchView$f; */
/* invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$f;-><init>(Landroidx/appcompat/widget/SearchView;)V */
this.l0 = v0;
/* .line 12 */
/* new-instance v0, Landroidx/appcompat/widget/SearchView$g; */
/* invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$g;-><init>(Landroidx/appcompat/widget/SearchView;)V */
this.m0 = v0;
/* .line 13 */
/* new-instance v0, Landroidx/appcompat/widget/SearchView$h; */
/* invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$h;-><init>(Landroidx/appcompat/widget/SearchView;)V */
this.n0 = v0;
/* .line 14 */
/* new-instance v0, Landroidx/appcompat/widget/SearchView$i; */
/* invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$i;-><init>(Landroidx/appcompat/widget/SearchView;)V */
this.o0 = v0;
/* .line 15 */
/* new-instance v0, Landroidx/appcompat/widget/SearchView$j; */
/* invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$j;-><init>(Landroidx/appcompat/widget/SearchView;)V */
this.p0 = v0;
/* .line 16 */
/* new-instance v0, Landroidx/appcompat/widget/SearchView$a; */
/* invoke-direct {v0, p0}, Landroidx/appcompat/widget/SearchView$a;-><init>(Landroidx/appcompat/widget/SearchView;)V */
this.q0 = v0;
/* .line 17 */
v0 = c.b.j.SearchView;
int v1 = 0; // const/4 v1, 0x0
c.b.q.k2 .a ( p1,p2,v0,p3,v1 );
/* .line 18 */
android.view.LayoutInflater .from ( p1 );
/* .line 19 */
p3 = (( c.b.q.k2 ) p2 ).g ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Lc/b/q/k2;->g(II)I
int v0 = 1; // const/4 v0, 0x1
/* .line 20 */
(( android.view.LayoutInflater ) p1 ).inflate ( p3, p0, v0 ); // invoke-virtual {p1, p3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* .line 21 */
(( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroidx/appcompat/widget/SearchView$SearchAutoComplete; */
this.q = p1;
/* .line 22 */
(( androidx.appcompat.widget.SearchView$SearchAutoComplete ) p1 ).setSearchView ( p0 ); // invoke-virtual {p1, p0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setSearchView(Landroidx/appcompat/widget/SearchView;)V
/* .line 23 */
(( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
this.r = p1;
/* .line 24 */
(( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
this.s = p1;
/* .line 25 */
(( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
this.t = p1;
/* .line 26 */
(( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/ImageView; */
this.u = p1;
/* .line 27 */
(( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/ImageView; */
this.v = p1;
/* .line 28 */
(( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/ImageView; */
this.w = p1;
/* .line 29 */
(( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/ImageView; */
this.x = p1;
/* .line 30 */
(( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/ImageView; */
this.E = p1;
/* .line 31 */
p1 = this.s;
/* .line 32 */
(( c.b.q.k2 ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
/* .line 33 */
c.h.n.v0 .a ( p1,p3 );
/* .line 34 */
p1 = this.t;
/* .line 35 */
(( c.b.q.k2 ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
/* .line 36 */
c.h.n.v0 .a ( p1,p3 );
/* .line 37 */
p1 = this.u;
(( c.b.q.k2 ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
(( android.widget.ImageView ) p1 ).setImageDrawable ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 38 */
p1 = this.v;
(( c.b.q.k2 ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
(( android.widget.ImageView ) p1 ).setImageDrawable ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 39 */
p1 = this.w;
(( c.b.q.k2 ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
(( android.widget.ImageView ) p1 ).setImageDrawable ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 40 */
p1 = this.x;
(( c.b.q.k2 ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
(( android.widget.ImageView ) p1 ).setImageDrawable ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 41 */
p1 = this.E;
(( c.b.q.k2 ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
(( android.widget.ImageView ) p1 ).setImageDrawable ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 42 */
(( c.b.q.k2 ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
this.F = p1;
/* .line 43 */
p1 = this.u;
/* .line 44 */
(( android.view.ViewGroup ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p3 ).getString ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 45 */
c.b.q.p2 .a ( p1,p3 );
/* .line 46 */
p1 = (( c.b.q.k2 ) p2 ).g ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Lc/b/q/k2;->g(II)I
/* iput p1, p0, Landroidx/appcompat/widget/SearchView;->G:I */
/* .line 47 */
p1 = (( c.b.q.k2 ) p2 ).g ( p1, v1 ); // invoke-virtual {p2, p1, v1}, Lc/b/q/k2;->g(II)I
/* iput p1, p0, Landroidx/appcompat/widget/SearchView;->H:I */
/* .line 48 */
p1 = this.u;
p3 = this.l0;
(( android.widget.ImageView ) p1 ).setOnClickListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 49 */
p1 = this.w;
p3 = this.l0;
(( android.widget.ImageView ) p1 ).setOnClickListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 50 */
p1 = this.v;
p3 = this.l0;
(( android.widget.ImageView ) p1 ).setOnClickListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 51 */
p1 = this.x;
p3 = this.l0;
(( android.widget.ImageView ) p1 ).setOnClickListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 52 */
p1 = this.q;
p3 = this.l0;
(( android.widget.AutoCompleteTextView ) p1 ).setOnClickListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/AutoCompleteTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 53 */
p1 = this.q;
p3 = this.q0;
(( android.widget.AutoCompleteTextView ) p1 ).addTextChangedListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/AutoCompleteTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V
/* .line 54 */
p1 = this.q;
p3 = this.n0;
(( android.widget.AutoCompleteTextView ) p1 ).setOnEditorActionListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/AutoCompleteTextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
/* .line 55 */
p1 = this.q;
p3 = this.o0;
(( android.widget.AutoCompleteTextView ) p1 ).setOnItemClickListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
/* .line 56 */
p1 = this.q;
p3 = this.p0;
(( android.widget.AutoCompleteTextView ) p1 ).setOnItemSelectedListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/AutoCompleteTextView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
/* .line 57 */
p1 = this.q;
p3 = this.m0;
(( android.widget.AutoCompleteTextView ) p1 ).setOnKeyListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/AutoCompleteTextView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V
/* .line 58 */
p1 = this.q;
/* new-instance p3, Landroidx/appcompat/widget/SearchView$d; */
/* invoke-direct {p3, p0}, Landroidx/appcompat/widget/SearchView$d;-><init>(Landroidx/appcompat/widget/SearchView;)V */
(( android.widget.AutoCompleteTextView ) p1 ).setOnFocusChangeListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/AutoCompleteTextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
/* .line 59 */
p1 = (( c.b.q.k2 ) p2 ).a ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Lc/b/q/k2;->a(IZ)Z
(( androidx.appcompat.widget.SearchView ) p0 ).setIconifiedByDefault ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setIconifiedByDefault(Z)V
/* .line 60 */
int p3 = -1; // const/4 p3, -0x1
p1 = (( c.b.q.k2 ) p2 ).c ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Lc/b/q/k2;->c(II)I
/* if-eq p1, p3, :cond_0 */
/* .line 61 */
(( androidx.appcompat.widget.SearchView ) p0 ).setMaxWidth ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setMaxWidth(I)V
/* .line 62 */
} // :cond_0
(( c.b.q.k2 ) p2 ).e ( p1 ); // invoke-virtual {p2, p1}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
this.K = p1;
/* .line 63 */
(( c.b.q.k2 ) p2 ).e ( p1 ); // invoke-virtual {p2, p1}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
this.U = p1;
/* .line 64 */
p1 = (( c.b.q.k2 ) p2 ).d ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Lc/b/q/k2;->d(II)I
/* if-eq p1, p3, :cond_1 */
/* .line 65 */
(( androidx.appcompat.widget.SearchView ) p0 ).setImeOptions ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setImeOptions(I)V
/* .line 66 */
} // :cond_1
p1 = (( c.b.q.k2 ) p2 ).d ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Lc/b/q/k2;->d(II)I
/* if-eq p1, p3, :cond_2 */
/* .line 67 */
(( androidx.appcompat.widget.SearchView ) p0 ).setInputType ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->setInputType(I)V
/* .line 68 */
} // :cond_2
p1 = (( c.b.q.k2 ) p2 ).a ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Lc/b/q/k2;->a(IZ)Z
/* .line 69 */
(( android.view.ViewGroup ) p0 ).setFocusable ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setFocusable(Z)V
/* .line 70 */
(( c.b.q.k2 ) p2 ).a ( ); // invoke-virtual {p2}, Lc/b/q/k2;->a()V
/* .line 71 */
/* new-instance p1, Landroid/content/Intent; */
final String p2 = "android.speech.action.WEB_SEARCH"; // const-string p2, "android.speech.action.WEB_SEARCH"
/* invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
this.I = p1;
/* const/high16 p2, 0x10000000 */
/* .line 72 */
(( android.content.Intent ) p1 ).addFlags ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 73 */
p1 = this.I;
final String p3 = "android.speech.extra.LANGUAGE_MODEL"; // const-string p3, "android.speech.extra.LANGUAGE_MODEL"
final String v0 = "web_search"; // const-string v0, "web_search"
(( android.content.Intent ) p1 ).putExtra ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 74 */
/* new-instance p1, Landroid/content/Intent; */
final String p3 = "android.speech.action.RECOGNIZE_SPEECH"; // const-string p3, "android.speech.action.RECOGNIZE_SPEECH"
/* invoke-direct {p1, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
this.J = p1;
/* .line 75 */
(( android.content.Intent ) p1 ).addFlags ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 76 */
p1 = this.q;
p1 = (( android.widget.AutoCompleteTextView ) p1 ).getDropDownAnchor ( ); // invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getDropDownAnchor()I
(( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
this.y = p1;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 77 */
/* new-instance p2, Landroidx/appcompat/widget/SearchView$e; */
/* invoke-direct {p2, p0}, Landroidx/appcompat/widget/SearchView$e;-><init>(Landroidx/appcompat/widget/SearchView;)V */
(( android.view.View ) p1 ).addOnLayoutChangeListener ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V
/* .line 78 */
} // :cond_3
/* iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->Q:Z */
(( androidx.appcompat.widget.SearchView ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->b(Z)V
/* .line 79 */
(( androidx.appcompat.widget.SearchView ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->r()V
return;
} // .end method
public static Boolean a ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 93 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p0 ).getConfiguration ( ); // invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget p0, p0, Landroid/content/res/Configuration;->orientation:I */
int v0 = 2; // const/4 v0, 0x2
/* if-ne p0, v0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
private Integer getPreferredHeight ( ) {
/* .locals 2 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 2 */
v0 = (( android.content.res.Resources ) v0 ).getDimensionPixelSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
} // .end method
private Integer getPreferredWidth ( ) {
/* .locals 2 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 2 */
v0 = (( android.content.res.Resources ) v0 ).getDimensionPixelSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
} // .end method
private void setQuery ( java.lang.CharSequence p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V
/* .line 2 */
v0 = this.q;
v1 = android.text.TextUtils .isEmpty ( p1 );
if ( v1 != null) { // if-eqz v1, :cond_0
int p1 = 0; // const/4 p1, 0x0
p1 = } // :cond_0
} // :goto_0
(( android.widget.AutoCompleteTextView ) v0 ).setSelection ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setSelection(I)V
return;
} // .end method
/* # virtual methods */
public final android.content.Intent a ( android.content.Intent p0, android.app.SearchableInfo p1 ) {
/* .locals 9 */
/* .line 56 */
(( android.app.SearchableInfo ) p2 ).getSearchActivity ( ); // invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;
/* .line 57 */
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "android.intent.action.SEARCH"; // const-string v2, "android.intent.action.SEARCH"
/* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 58 */
(( android.content.Intent ) v1 ).setComponent ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
/* .line 59 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
int v3 = 0; // const/4 v3, 0x0
/* const/high16 v4, 0x40000000 # 2.0f */
android.app.PendingIntent .getActivity ( v2,v3,v1,v4 );
/* .line 60 */
/* new-instance v2, Landroid/os/Bundle; */
/* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
/* .line 61 */
v3 = this.h0;
if ( v3 != null) { // if-eqz v3, :cond_0
final String v4 = "app_data"; // const-string v4, "app_data"
/* .line 62 */
(( android.os.Bundle ) v2 ).putParcelable ( v4, v3 ); // invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
/* .line 63 */
} // :cond_0
/* new-instance v3, Landroid/content/Intent; */
/* invoke-direct {v3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V */
int p1 = 1; // const/4 p1, 0x1
/* .line 64 */
(( android.view.ViewGroup ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;
/* .line 65 */
v5 = (( android.app.SearchableInfo ) p2 ).getVoiceLanguageModeId ( ); // invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 66 */
v5 = (( android.app.SearchableInfo ) p2 ).getVoiceLanguageModeId ( ); // invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I
(( android.content.res.Resources ) v4 ).getString ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
} // :cond_1
final String v5 = "free_form"; // const-string v5, "free_form"
/* .line 67 */
} // :goto_0
v6 = (( android.app.SearchableInfo ) p2 ).getVoicePromptTextId ( ); // invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I
int v7 = 0; // const/4 v7, 0x0
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 68 */
v6 = (( android.app.SearchableInfo ) p2 ).getVoicePromptTextId ( ); // invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I
(( android.content.res.Resources ) v4 ).getString ( v6 ); // invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
} // :cond_2
/* move-object v6, v7 */
/* .line 69 */
} // :goto_1
v8 = (( android.app.SearchableInfo ) p2 ).getVoiceLanguageId ( ); // invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I
if ( v8 != null) { // if-eqz v8, :cond_3
/* .line 70 */
v8 = (( android.app.SearchableInfo ) p2 ).getVoiceLanguageId ( ); // invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I
(( android.content.res.Resources ) v4 ).getString ( v8 ); // invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
} // :cond_3
/* move-object v4, v7 */
/* .line 71 */
} // :goto_2
v8 = (( android.app.SearchableInfo ) p2 ).getVoiceMaxResults ( ); // invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I
if ( v8 != null) { // if-eqz v8, :cond_4
/* .line 72 */
p1 = (( android.app.SearchableInfo ) p2 ).getVoiceMaxResults ( ); // invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I
} // :cond_4
final String p2 = "android.speech.extra.LANGUAGE_MODEL"; // const-string p2, "android.speech.extra.LANGUAGE_MODEL"
/* .line 73 */
(( android.content.Intent ) v3 ).putExtra ( p2, v5 ); // invoke-virtual {v3, p2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String p2 = "android.speech.extra.PROMPT"; // const-string p2, "android.speech.extra.PROMPT"
/* .line 74 */
(( android.content.Intent ) v3 ).putExtra ( p2, v6 ); // invoke-virtual {v3, p2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String p2 = "android.speech.extra.LANGUAGE"; // const-string p2, "android.speech.extra.LANGUAGE"
/* .line 75 */
(( android.content.Intent ) v3 ).putExtra ( p2, v4 ); // invoke-virtual {v3, p2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String p2 = "android.speech.extra.MAX_RESULTS"; // const-string p2, "android.speech.extra.MAX_RESULTS"
/* .line 76 */
(( android.content.Intent ) v3 ).putExtra ( p2, p1 ); // invoke-virtual {v3, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* if-nez v0, :cond_5 */
/* .line 77 */
} // :cond_5
(( android.content.ComponentName ) v0 ).flattenToShortString ( ); // invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
} // :goto_3
final String p1 = "calling_package"; // const-string p1, "calling_package"
/* .line 78 */
(( android.content.Intent ) v3 ).putExtra ( p1, v7 ); // invoke-virtual {v3, p1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String p1 = "android.speech.extra.RESULTS_PENDINGINTENT"; // const-string p1, "android.speech.extra.RESULTS_PENDINGINTENT"
/* .line 79 */
(( android.content.Intent ) v3 ).putExtra ( p1, v1 ); // invoke-virtual {v3, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
final String p1 = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"; // const-string p1, "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
/* .line 80 */
(( android.content.Intent ) v3 ).putExtra ( p1, v2 ); // invoke-virtual {v3, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
} // .end method
public final android.content.Intent a ( android.database.Cursor p0, Integer p1, java.lang.String p2 ) {
/* .locals 8 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
final String v1 = "suggest_intent_action"; // const-string v1, "suggest_intent_action"
/* .line 81 */
c.b.q.f2 .a ( p1,v1 );
/* if-nez v1, :cond_0 */
/* .line 82 */
v1 = this.g0;
(( android.app.SearchableInfo ) v1 ).getSuggestIntentAction ( ); // invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestIntentAction()Ljava/lang/String;
} // :cond_0
/* if-nez v1, :cond_1 */
final String v1 = "android.intent.action.SEARCH"; // const-string v1, "android.intent.action.SEARCH"
} // :cond_1
/* move-object v2, v1 */
final String v1 = "suggest_intent_data"; // const-string v1, "suggest_intent_data"
/* .line 83 */
c.b.q.f2 .a ( p1,v1 );
/* if-nez v1, :cond_2 */
/* .line 84 */
v1 = this.g0;
(( android.app.SearchableInfo ) v1 ).getSuggestIntentData ( ); // invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestIntentData()Ljava/lang/String;
} // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_3
final String v3 = "suggest_intent_data_id"; // const-string v3, "suggest_intent_data_id"
/* .line 85 */
c.b.q.f2 .a ( p1,v3 );
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 86 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "/"; // const-string v1, "/"
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
android.net.Uri .encode ( v3 );
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_3
/* if-nez v1, :cond_4 */
/* move-object v3, v0 */
/* .line 87 */
} // :cond_4
android.net.Uri .parse ( v1 );
/* move-object v3, v1 */
} // :goto_0
final String v1 = "suggest_intent_query"; // const-string v1, "suggest_intent_query"
/* .line 88 */
c.b.q.f2 .a ( p1,v1 );
final String v1 = "suggest_intent_extra_data"; // const-string v1, "suggest_intent_extra_data"
/* .line 89 */
c.b.q.f2 .a ( p1,v1 );
/* move-object v1, p0 */
/* move v6, p2 */
/* move-object v7, p3 */
/* .line 90 */
/* invoke-virtual/range {v1 ..v7}, Landroidx/appcompat/widget/SearchView;->a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent; */
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p2 */
/* .line 91 */
p1 = try { // :try_start_1
/* :try_end_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
int p1 = -1; // const/4 p1, -0x1
/* .line 92 */
} // :goto_1
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Search suggestions cursor at row "; // const-string v1, "Search suggestions cursor at row "
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " returned exception."; // const-string p1, " returned exception."
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p3 = "SearchView"; // const-string p3, "SearchView"
android.util.Log .w ( p3,p1,p2 );
} // .end method
public final android.content.Intent a ( java.lang.String p0, android.net.Uri p1, java.lang.String p2, java.lang.String p3, Integer p4, java.lang.String p5 ) {
/* .locals 1 */
/* .line 45 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* const/high16 p1, 0x10000000 */
/* .line 46 */
(( android.content.Intent ) v0 ).addFlags ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 47 */
(( android.content.Intent ) v0 ).setData ( p2 ); // invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 48 */
} // :cond_0
p1 = this.d0;
final String p2 = "user_query"; // const-string p2, "user_query"
(( android.content.Intent ) v0 ).putExtra ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;
if ( p4 != null) { // if-eqz p4, :cond_1
final String p1 = "query"; // const-string p1, "query"
/* .line 49 */
(( android.content.Intent ) v0 ).putExtra ( p1, p4 ); // invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
} // :cond_1
if ( p3 != null) { // if-eqz p3, :cond_2
final String p1 = "intent_extra_data_key"; // const-string p1, "intent_extra_data_key"
/* .line 50 */
(( android.content.Intent ) v0 ).putExtra ( p1, p3 ); // invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 51 */
} // :cond_2
p1 = this.h0;
if ( p1 != null) { // if-eqz p1, :cond_3
final String p2 = "app_data"; // const-string p2, "app_data"
/* .line 52 */
(( android.content.Intent ) v0 ).putExtra ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
} // :cond_3
if ( p5 != null) { // if-eqz p5, :cond_4
final String p1 = "action_key"; // const-string p1, "action_key"
/* .line 53 */
(( android.content.Intent ) v0 ).putExtra ( p1, p5 ); // invoke-virtual {v0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String p1 = "action_msg"; // const-string p1, "action_msg"
/* .line 54 */
(( android.content.Intent ) v0 ).putExtra ( p1, p6 ); // invoke-virtual {v0, p1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 55 */
} // :cond_4
p1 = this.g0;
(( android.app.SearchableInfo ) p1 ).getSearchActivity ( ); // invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;
(( android.content.Intent ) v0 ).setComponent ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
} // .end method
public final java.lang.CharSequence a ( java.lang.CharSequence p0 ) {
/* .locals 5 */
/* .line 25 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Q:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.F;
/* if-nez v0, :cond_0 */
/* .line 26 */
} // :cond_0
v0 = this.q;
v0 = (( android.widget.AutoCompleteTextView ) v0 ).getTextSize ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getTextSize()F
/* float-to-double v0, v0 */
/* const-wide/high16 v2, 0x3ff4000000000000L # 1.25 */
/* mul-double v0, v0, v2 */
/* double-to-int v0, v0 */
/* .line 27 */
v1 = this.F;
int v2 = 0; // const/4 v2, 0x0
(( android.graphics.drawable.Drawable ) v1 ).setBounds ( v2, v2, v0, v0 ); // invoke-virtual {v1, v2, v2, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 28 */
/* new-instance v0, Landroid/text/SpannableStringBuilder; */
final String v1 = " "; // const-string v1, " "
/* invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V */
/* .line 29 */
/* new-instance v1, Landroid/text/style/ImageSpan; */
v2 = this.F;
/* invoke-direct {v1, v2}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V */
int v2 = 1; // const/4 v2, 0x1
int v3 = 2; // const/4 v3, 0x2
/* const/16 v4, 0x21 */
(( android.text.SpannableStringBuilder ) v0 ).setSpan ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
/* .line 30 */
(( android.text.SpannableStringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
} // :cond_1
} // :goto_0
} // .end method
public void a ( ) {
/* .locals 3 */
/* .line 31 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->e0:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 32 */
/* iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->e0:Z */
/* .line 33 */
v0 = this.q;
v0 = (( android.widget.AutoCompleteTextView ) v0 ).getImeOptions ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getImeOptions()I
/* iput v0, p0, Landroidx/appcompat/widget/SearchView;->f0:I */
/* .line 34 */
v1 = this.q;
/* const/high16 v2, 0x2000000 */
/* or-int/2addr v0, v2 */
(( android.widget.AutoCompleteTextView ) v1 ).setImeOptions ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V
/* .line 35 */
v0 = this.q;
final String v1 = ""; // const-string v1, ""
(( android.widget.AutoCompleteTextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 36 */
(( androidx.appcompat.widget.SearchView ) p0 ).setIconified ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V
return;
} // .end method
public void a ( Integer p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 7 */
final String v1 = "android.intent.action.SEARCH"; // const-string v1, "android.intent.action.SEARCH"
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* move-object v0, p0 */
/* move-object v4, p3 */
/* move v5, p1 */
/* move-object v6, p2 */
/* .line 43 */
/* invoke-virtual/range {v0 ..v6}, Landroidx/appcompat/widget/SearchView;->a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent; */
/* .line 44 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) p2 ).startActivity ( p1 ); // invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
return;
} // .end method
public final void a ( android.content.Intent p0 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
return;
/* .line 41 */
} // :cond_0
try { // :try_start_0
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).startActivity ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 42 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed launch activity: "; // const-string v2, "Failed launch activity: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "SearchView"; // const-string v1, "SearchView"
android.util.Log .e ( v1,p1,v0 );
} // :goto_0
return;
} // .end method
public final void a ( android.view.View p0, android.graphics.Rect p1 ) {
/* .locals 4 */
/* .line 6 */
v0 = this.C;
(( android.view.View ) p1 ).getLocationInWindow ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V
/* .line 7 */
v0 = this.D;
(( android.view.ViewGroup ) p0 ).getLocationInWindow ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getLocationInWindow([I)V
/* .line 8 */
v0 = this.C;
int v1 = 1; // const/4 v1, 0x1
/* aget v2, v0, v1 */
v3 = this.D;
/* aget v1, v3, v1 */
/* sub-int/2addr v2, v1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
/* aget v0, v0, v1 */
/* aget v1, v3, v1 */
/* sub-int/2addr v0, v1 */
/* .line 10 */
v1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* add-int/2addr v1, v0 */
p1 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
/* add-int/2addr p1, v2 */
(( android.graphics.Rect ) p2 ).set ( v0, v2, v1, p1 ); // invoke-virtual {p2, v0, v2, v1, p1}, Landroid/graphics/Rect;->set(IIII)V
return;
} // .end method
public void a ( java.lang.CharSequence p0, Boolean p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
v0 = this.q;
v1 = (( android.widget.AutoCompleteTextView ) v0 ).length ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->length()I
(( android.widget.AutoCompleteTextView ) v0 ).setSelection ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setSelection(I)V
/* .line 3 */
this.d0 = p1;
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 4 */
p1 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez p1, :cond_1 */
/* .line 5 */
(( androidx.appcompat.widget.SearchView ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->l()V
} // :cond_1
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 11 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->T:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( androidx.appcompat.widget.SearchView ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.view.ViewGroup ) p0 ).hasFocus ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->hasFocus()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* if-nez p1, :cond_0 */
/* iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->b0:Z */
/* if-nez p1, :cond_1 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
/* const/16 p1, 0x8 */
/* .line 12 */
} // :goto_0
v0 = this.v;
(( android.widget.ImageView ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V
return;
} // .end method
public final Boolean a ( Integer p0, Integer p1, java.lang.String p2 ) {
/* .locals 1 */
/* .line 37 */
v0 = this.S;
(( c.i.a.c ) v0 ).a ( ); // invoke-virtual {v0}, Lc/i/a/c;->a()Landroid/database/Cursor;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = /* .line 38 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 39 */
(( androidx.appcompat.widget.SearchView ) p0 ).a ( v0, p2, p3 ); // invoke-virtual {p0, v0, p2, p3}, Landroidx/appcompat/widget/SearchView;->a(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;
/* .line 40 */
(( androidx.appcompat.widget.SearchView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->a(Landroid/content/Intent;)V
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean a ( android.view.View p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 1 */
/* .line 13 */
p1 = this.g0;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 14 */
} // :cond_0
p1 = this.S;
/* if-nez p1, :cond_1 */
/* .line 15 */
} // :cond_1
p1 = (( android.view.KeyEvent ) p3 ).getAction ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
/* if-nez p1, :cond_7 */
p1 = (( android.view.KeyEvent ) p3 ).hasNoModifiers ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->hasNoModifiers()Z
if ( p1 != null) { // if-eqz p1, :cond_7
/* const/16 p1, 0x42 */
/* if-eq p2, p1, :cond_6 */
/* const/16 p1, 0x54 */
/* if-eq p2, p1, :cond_6 */
/* const/16 p1, 0x3d */
/* if-ne p2, p1, :cond_2 */
} // :cond_2
/* const/16 p1, 0x15 */
/* if-eq p2, p1, :cond_4 */
/* const/16 p3, 0x16 */
/* if-ne p2, p3, :cond_3 */
} // :cond_3
/* const/16 p1, 0x13 */
/* if-ne p2, p1, :cond_7 */
/* .line 16 */
p1 = this.q;
p1 = (( android.widget.AutoCompleteTextView ) p1 ).getListSelection ( ); // invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getListSelection()I
/* if-nez p1, :cond_7 */
} // :cond_4
} // :goto_0
/* if-ne p2, p1, :cond_5 */
int p1 = 0; // const/4 p1, 0x0
/* .line 17 */
} // :cond_5
p1 = this.q;
/* .line 18 */
p1 = (( android.widget.AutoCompleteTextView ) p1 ).length ( ); // invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->length()I
/* .line 19 */
} // :goto_1
p2 = this.q;
(( android.widget.AutoCompleteTextView ) p2 ).setSelection ( p1 ); // invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setSelection(I)V
/* .line 20 */
p1 = this.q;
(( android.widget.AutoCompleteTextView ) p1 ).setListSelection ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setListSelection(I)V
/* .line 21 */
p1 = this.q;
(( android.widget.AutoCompleteTextView ) p1 ).clearListSelection ( ); // invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->clearListSelection()V
/* .line 22 */
p1 = androidx.appcompat.widget.SearchView.r0;
p2 = this.q;
int p3 = 1; // const/4 p3, 0x1
(( androidx.appcompat.widget.SearchView$k ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroidx/appcompat/widget/SearchView$k;->a(Landroid/widget/AutoCompleteTextView;Z)V
/* .line 23 */
} // :cond_6
} // :goto_2
p1 = this.q;
p1 = (( android.widget.AutoCompleteTextView ) p1 ).getListSelection ( ); // invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getListSelection()I
int p2 = 0; // const/4 p2, 0x0
/* .line 24 */
p1 = (( androidx.appcompat.widget.SearchView ) p0 ).b ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Landroidx/appcompat/widget/SearchView;->b(IILjava/lang/String;)Z
} // :cond_7
} // .end method
public final android.content.Intent b ( android.content.Intent p0, android.app.SearchableInfo p1 ) {
/* .locals 1 */
/* .line 22 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V */
/* .line 23 */
(( android.app.SearchableInfo ) p2 ).getSearchActivity ( ); // invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 24 */
} // :cond_0
(( android.content.ComponentName ) p1 ).flattenToShortString ( ); // invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
} // :goto_0
final String p2 = "calling_package"; // const-string p2, "calling_package"
/* .line 25 */
(( android.content.Intent ) v0 ).putExtra ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
} // .end method
public void b ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
final String v1 = ""; // const-string v1, ""
/* .line 12 */
(( androidx.appcompat.widget.SearchView ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/SearchView;->a(Ljava/lang/CharSequence;Z)V
/* .line 13 */
(( androidx.appcompat.widget.SearchView ) p0 ).clearFocus ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V
int v1 = 1; // const/4 v1, 0x1
/* .line 14 */
(( androidx.appcompat.widget.SearchView ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SearchView;->b(Z)V
/* .line 15 */
v1 = this.q;
/* iget v2, p0, Landroidx/appcompat/widget/SearchView;->f0:I */
(( android.widget.AutoCompleteTextView ) v1 ).setImeOptions ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V
/* .line 16 */
/* iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->e0:Z */
return;
} // .end method
public void b ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 11 */
/* invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V */
return;
} // .end method
public final void b ( Boolean p0 ) {
/* .locals 5 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->R:Z */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x8 */
if ( p1 != null) { // if-eqz p1, :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :cond_0
/* const/16 v2, 0x8 */
/* .line 2 */
} // :goto_0
v3 = this.q;
(( android.widget.AutoCompleteTextView ) v3 ).getText ( ); // invoke-virtual {v3}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;
v3 = android.text.TextUtils .isEmpty ( v3 );
/* xor-int/lit8 v3, v3, 0x1 */
/* .line 3 */
v4 = this.u;
(( android.widget.ImageView ) v4 ).setVisibility ( v2 ); // invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 4 */
(( androidx.appcompat.widget.SearchView ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Landroidx/appcompat/widget/SearchView;->a(Z)V
/* .line 5 */
v2 = this.r;
if ( p1 != null) { // if-eqz p1, :cond_1
/* const/16 p1, 0x8 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
(( android.view.View ) v2 ).setVisibility ( p1 ); // invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V
/* .line 6 */
p1 = this.E;
(( android.widget.ImageView ) p1 ).getDrawable ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
if ( p1 != null) { // if-eqz p1, :cond_2
/* iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->Q:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
} // :cond_2
/* const/16 v0, 0x8 */
/* .line 7 */
} // :cond_3
p1 = this.E;
(( android.widget.ImageView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 8 */
(( androidx.appcompat.widget.SearchView ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->p()V
/* xor-int/lit8 p1, v3, 0x1 */
/* .line 9 */
(( androidx.appcompat.widget.SearchView ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->c(Z)V
/* .line 10 */
(( androidx.appcompat.widget.SearchView ) p0 ).t ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->t()V
return;
} // .end method
public Boolean b ( Integer p0, Integer p1, java.lang.String p2 ) {
/* .locals 0 */
/* .line 17 */
p2 = this.O;
int p3 = 0; // const/4 p3, 0x0
if ( p2 != null) { // if-eqz p2, :cond_1
p2 = /* .line 18 */
/* if-nez p2, :cond_0 */
} // :cond_0
} // :cond_1
} // :goto_0
int p2 = 0; // const/4 p2, 0x0
/* .line 19 */
(( androidx.appcompat.widget.SearchView ) p0 ).a ( p1, p3, p2 ); // invoke-virtual {p0, p1, p3, p2}, Landroidx/appcompat/widget/SearchView;->a(IILjava/lang/String;)Z
/* .line 20 */
p1 = this.q;
(( androidx.appcompat.widget.SearchView$SearchAutoComplete ) p1 ).setImeVisibility ( p3 ); // invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V
/* .line 21 */
(( androidx.appcompat.widget.SearchView ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->e()V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void c ( java.lang.CharSequence p0 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;
/* .line 5 */
this.d0 = v0;
/* .line 6 */
v0 = android.text.TextUtils .isEmpty ( v0 );
/* xor-int/lit8 v0, v0, 0x1 */
/* .line 7 */
(( androidx.appcompat.widget.SearchView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->a(Z)V
/* xor-int/lit8 v0, v0, 0x1 */
/* .line 8 */
(( androidx.appcompat.widget.SearchView ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->c(Z)V
/* .line 9 */
(( androidx.appcompat.widget.SearchView ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->p()V
/* .line 10 */
(( androidx.appcompat.widget.SearchView ) p0 ).t ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->t()V
/* .line 11 */
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.c0;
v0 = android.text.TextUtils .equals ( p1,v0 );
/* if-nez v0, :cond_0 */
/* .line 12 */
v0 = this.L;
/* .line 13 */
} // :cond_0
this.c0 = p1;
return;
} // .end method
public final void c ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->b0:Z */
/* const/16 v1, 0x8 */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.appcompat.widget.SearchView ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->h()Z
/* if-nez v0, :cond_0 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
v0 = this.v;
(( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :cond_0
p1 = this.x;
(( android.widget.ImageView ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V
return;
} // .end method
public void clearFocus ( ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->W:Z */
/* .line 2 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->clearFocus()V */
/* .line 3 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).clearFocus ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->clearFocus()V
/* .line 4 */
v0 = this.q;
int v1 = 0; // const/4 v1, 0x0
(( androidx.appcompat.widget.SearchView$SearchAutoComplete ) v0 ).setImeVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V
/* .line 5 */
/* iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->W:Z */
return;
} // .end method
public void d ( ) {
/* .locals 6 */
/* .line 1 */
v0 = this.y;
v0 = (( android.view.View ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/View;->getWidth()I
int v1 = 1; // const/4 v1, 0x1
/* if-le v0, v1, :cond_2 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 3 */
v1 = this.s;
v1 = (( android.view.View ) v1 ).getPaddingLeft ( ); // invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I
/* .line 4 */
/* new-instance v2, Landroid/graphics/Rect; */
/* invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V */
/* .line 5 */
v3 = c.b.q.v2 .a ( p0 );
/* .line 6 */
/* iget-boolean v4, p0, Landroidx/appcompat/widget/SearchView;->Q:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 7 */
v4 = (( android.content.res.Resources ) v0 ).getDimensionPixelSize ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
/* .line 8 */
v0 = (( android.content.res.Resources ) v0 ).getDimensionPixelSize ( v5 ); // invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
/* add-int/2addr v4, v0 */
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 9 */
} // :goto_0
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).getDropDownBackground ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;
(( android.graphics.drawable.Drawable ) v0 ).getPadding ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 10 */
/* iget v0, v2, Landroid/graphics/Rect;->left:I */
/* neg-int v0, v0 */
/* .line 11 */
} // :cond_1
/* iget v0, v2, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v0, v4 */
/* sub-int v0, v1, v0 */
/* .line 12 */
} // :goto_1
v3 = this.q;
(( android.widget.AutoCompleteTextView ) v3 ).setDropDownHorizontalOffset ( v0 ); // invoke-virtual {v3, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V
/* .line 13 */
v0 = this.y;
v0 = (( android.view.View ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/View;->getWidth()I
/* iget v3, v2, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v0, v3 */
/* iget v2, v2, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v0, v2 */
/* add-int/2addr v0, v4 */
/* sub-int/2addr v0, v1 */
/* .line 14 */
v1 = this.q;
(( android.widget.AutoCompleteTextView ) v1 ).setDropDownWidth ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V
} // :cond_2
return;
} // .end method
public Boolean d ( Integer p0 ) {
/* .locals 1 */
/* .line 15 */
v0 = this.O;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* .line 16 */
/* if-nez v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 17 */
} // :cond_1
} // :goto_0
(( androidx.appcompat.widget.SearchView ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->e(I)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public final void e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).dismissDropDown ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V
return;
} // .end method
public final void e ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;
/* .line 3 */
v1 = this.S;
(( c.i.a.c ) v1 ).a ( ); // invoke-virtual {v1}, Lc/i/a/c;->a()Landroid/database/Cursor;
/* if-nez v1, :cond_0 */
return;
/* .line 4 */
p1 = } // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 5 */
p1 = this.S;
(( c.i.a.c ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/i/a/c;->a(Landroid/database/Cursor;)Ljava/lang/CharSequence;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 6 */
/* invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V */
/* .line 7 */
} // :cond_1
/* invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V */
/* .line 8 */
} // :cond_2
/* invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V */
} // :goto_0
return;
} // .end method
public void f ( ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1d */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).refreshAutoCompleteResults ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->refreshAutoCompleteResults()V
/* .line 3 */
} // :cond_0
v0 = androidx.appcompat.widget.SearchView.r0;
v1 = this.q;
(( androidx.appcompat.widget.SearchView$k ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$k;->b(Landroid/widget/AutoCompleteTextView;)V
/* .line 4 */
v0 = androidx.appcompat.widget.SearchView.r0;
v1 = this.q;
(( androidx.appcompat.widget.SearchView$k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$k;->a(Landroid/widget/AutoCompleteTextView;)V
} // :goto_0
return;
} // .end method
public final Boolean g ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.g0;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( android.app.SearchableInfo ) v0 ).getVoiceSearchEnabled ( ); // invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
v2 = this.g0;
v2 = (( android.app.SearchableInfo ) v2 ).getVoiceSearchLaunchWebSearch ( ); // invoke-virtual {v2}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
v0 = this.I;
/* .line 4 */
} // :cond_0
v2 = this.g0;
v2 = (( android.app.SearchableInfo ) v2 ).getVoiceSearchLaunchRecognizer ( ); // invoke-virtual {v2}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 5 */
v0 = this.J;
} // :cond_1
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v2 ).getPackageManager ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* const/high16 v3, 0x10000 */
(( android.content.pm.PackageManager ) v2 ).resolveActivity ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
if ( v0 != null) { // if-eqz v0, :cond_2
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
} // .end method
public Integer getImeOptions ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
v0 = (( android.widget.AutoCompleteTextView ) v0 ).getImeOptions ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getImeOptions()I
} // .end method
public Integer getInputType ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
v0 = (( android.widget.AutoCompleteTextView ) v0 ).getInputType ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getInputType()I
} // .end method
public Integer getMaxWidth ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/SearchView;->a0:I */
} // .end method
public java.lang.CharSequence getQuery ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;
} // .end method
public java.lang.CharSequence getQueryHint ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.U;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.g0;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.app.SearchableInfo ) v0 ).getHintId ( ); // invoke-virtual {v0}, Landroid/app/SearchableInfo;->getHintId()I
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
v1 = this.g0;
v1 = (( android.app.SearchableInfo ) v1 ).getHintId ( ); // invoke-virtual {v1}, Landroid/app/SearchableInfo;->getHintId()I
(( android.content.Context ) v0 ).getText ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
/* .line 4 */
} // :cond_1
v0 = this.K;
} // :goto_0
} // .end method
public Integer getSuggestionCommitIconResId ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/SearchView;->H:I */
} // .end method
public Integer getSuggestionRowLayout ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/SearchView;->G:I */
} // .end method
public c.i.a.c getSuggestionsAdapter ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.S;
} // .end method
public Boolean h ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->R:Z */
} // .end method
public final Boolean i ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->T:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->b0:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
v0 = (( androidx.appcompat.widget.SearchView ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->h()Z
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void j ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;
/* .line 2 */
v0 = android.text.TextUtils .isEmpty ( v0 );
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Q:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 4 */
v0 = this.M;
v0 = if ( v0 != null) { // if-eqz v0, :cond_0
/* if-nez v0, :cond_2 */
/* .line 5 */
} // :cond_0
(( androidx.appcompat.widget.SearchView ) p0 ).clearFocus ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V
/* .line 6 */
(( androidx.appcompat.widget.SearchView ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SearchView;->b(Z)V
/* .line 7 */
} // :cond_1
v0 = this.q;
final String v2 = ""; // const-string v2, ""
(( android.widget.AutoCompleteTextView ) v0 ).setText ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V
/* .line 8 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->requestFocus()Z
/* .line 9 */
v0 = this.q;
(( androidx.appcompat.widget.SearchView$SearchAutoComplete ) v0 ).setImeVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V
} // :cond_2
} // :goto_0
return;
} // .end method
public void k ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( androidx.appcompat.widget.SearchView ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->b(Z)V
/* .line 2 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->requestFocus()Z
/* .line 3 */
v0 = this.q;
int v1 = 1; // const/4 v1, 0x1
(( androidx.appcompat.widget.SearchView$SearchAutoComplete ) v0 ).setImeVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V
/* .line 4 */
v0 = this.P;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
} // :cond_0
return;
} // .end method
public void l ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
v1 = android.text.TextUtils .getTrimmedLength ( v0 );
/* if-lez v1, :cond_2 */
/* .line 3 */
v1 = this.L;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = /* .line 4 */
/* if-nez v1, :cond_2 */
/* .line 5 */
} // :cond_0
v1 = this.g0;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 6 */
(( androidx.appcompat.widget.SearchView ) p0 ).a ( v2, v1, v0 ); // invoke-virtual {p0, v2, v1, v0}, Landroidx/appcompat/widget/SearchView;->a(ILjava/lang/String;Ljava/lang/String;)V
/* .line 7 */
} // :cond_1
v0 = this.q;
(( androidx.appcompat.widget.SearchView$SearchAutoComplete ) v0 ).setImeVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V
/* .line 8 */
(( androidx.appcompat.widget.SearchView ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->e()V
} // :cond_2
return;
} // .end method
public void m ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( androidx.appcompat.widget.SearchView ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->h()Z
(( androidx.appcompat.widget.SearchView ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->b(Z)V
/* .line 2 */
(( androidx.appcompat.widget.SearchView ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->o()V
/* .line 3 */
v0 = this.q;
v0 = (( android.widget.AutoCompleteTextView ) v0 ).hasFocus ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->hasFocus()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( androidx.appcompat.widget.SearchView ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->f()V
} // :cond_0
return;
} // .end method
public void n ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g0;
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
try { // :try_start_0
v1 = (( android.app.SearchableInfo ) v0 ).getVoiceSearchLaunchWebSearch ( ); // invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
v1 = this.I;
(( androidx.appcompat.widget.SearchView ) p0 ).b ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/SearchView;->b(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
/* .line 4 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 5 */
} // :cond_1
v1 = (( android.app.SearchableInfo ) v0 ).getVoiceSearchLaunchRecognizer ( ); // invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 6 */
v1 = this.J;
(( androidx.appcompat.widget.SearchView ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/SearchView;->a(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
/* .line 7 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String v0 = "SearchView"; // const-string v0, "SearchView"
final String v1 = "Could not find voice search activity"; // const-string v1, "Could not find voice search activity"
/* .line 8 */
android.util.Log .w ( v0,v1 );
} // :cond_2
} // :goto_0
return;
} // .end method
public final void o ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i0;
(( android.view.ViewGroup ) p0 ).post ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i0;
(( android.view.ViewGroup ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 2 */
v0 = this.j0;
(( android.view.ViewGroup ) p0 ).post ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
/* .line 3 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super/range {p0 ..p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->onLayout(ZIIII)V */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 2 */
p1 = this.q;
p2 = this.A;
(( androidx.appcompat.widget.SearchView ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/SearchView;->a(Landroid/view/View;Landroid/graphics/Rect;)V
/* .line 3 */
p1 = this.B;
p2 = this.A;
/* iget p4, p2, Landroid/graphics/Rect;->left:I */
int v0 = 0; // const/4 v0, 0x0
/* iget p2, p2, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr p5, p3 */
(( android.graphics.Rect ) p1 ).set ( p4, v0, p2, p5 ); // invoke-virtual {p1, p4, v0, p2, p5}, Landroid/graphics/Rect;->set(IIII)V
/* .line 4 */
p1 = this.z;
/* if-nez p1, :cond_0 */
/* .line 5 */
/* new-instance p1, Landroidx/appcompat/widget/SearchView$p; */
p2 = this.B;
p3 = this.A;
p4 = this.q;
/* invoke-direct {p1, p2, p3, p4}, Landroidx/appcompat/widget/SearchView$p;-><init>(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/view/View;)V */
this.z = p1;
/* .line 6 */
(( android.view.ViewGroup ) p0 ).setTouchDelegate ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setTouchDelegate(Landroid/view/TouchDelegate;)V
/* .line 7 */
} // :cond_0
p2 = this.B;
p3 = this.A;
(( androidx.appcompat.widget.SearchView$p ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroidx/appcompat/widget/SearchView$p;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = (( androidx.appcompat.widget.SearchView ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V */
return;
/* .line 3 */
} // :cond_0
v0 = android.view.View$MeasureSpec .getMode ( p1 );
/* .line 4 */
p1 = android.view.View$MeasureSpec .getSize ( p1 );
/* const/high16 v1, -0x80000000 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* if-eq v0, v1, :cond_4 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-eq v0, v2, :cond_1 */
/* .line 5 */
} // :cond_1
/* iget v0, p0, Landroidx/appcompat/widget/SearchView;->a0:I */
/* if-lez v0, :cond_6 */
/* .line 6 */
p1 = java.lang.Math .min ( v0,p1 );
/* .line 7 */
} // :cond_2
/* iget p1, p0, Landroidx/appcompat/widget/SearchView;->a0:I */
/* if-lez p1, :cond_3 */
} // :cond_3
p1 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredWidth()I */
/* .line 8 */
} // :cond_4
/* iget v0, p0, Landroidx/appcompat/widget/SearchView;->a0:I */
/* if-lez v0, :cond_5 */
/* .line 9 */
p1 = java.lang.Math .min ( v0,p1 );
/* .line 10 */
} // :cond_5
v0 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredWidth()I */
p1 = java.lang.Math .min ( v0,p1 );
/* .line 11 */
} // :cond_6
} // :goto_0
v0 = android.view.View$MeasureSpec .getMode ( p2 );
/* .line 12 */
p2 = android.view.View$MeasureSpec .getSize ( p2 );
/* if-eq v0, v1, :cond_8 */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 13 */
} // :cond_7
p2 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredHeight()I */
/* .line 14 */
} // :cond_8
v0 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredHeight()I */
p2 = java.lang.Math .min ( v0,p2 );
/* .line 15 */
} // :goto_1
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v2 );
/* .line 16 */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v2 );
/* .line 17 */
/* invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V */
return;
} // .end method
public void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Landroidx/appcompat/widget/SearchView$o; */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
/* .line 3 */
} // :cond_0
/* check-cast p1, Landroidx/appcompat/widget/SearchView$o; */
/* .line 4 */
(( c.j.a.c ) p1 ).a ( ); // invoke-virtual {p1}, Lc/j/a/c;->a()Landroid/os/Parcelable;
/* invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
/* .line 5 */
/* iget-boolean p1, p1, Landroidx/appcompat/widget/SearchView$o;->d:Z */
(( androidx.appcompat.widget.SearchView ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->b(Z)V
/* .line 6 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
return;
} // .end method
public android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable; */
/* .line 2 */
/* new-instance v1, Landroidx/appcompat/widget/SearchView$o; */
/* invoke-direct {v1, v0}, Landroidx/appcompat/widget/SearchView$o;-><init>(Landroid/os/Parcelable;)V */
/* .line 3 */
v0 = (( androidx.appcompat.widget.SearchView ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->h()Z
/* iput-boolean v0, v1, Landroidx/appcompat/widget/SearchView$o;->d:Z */
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowFocusChanged(Z)V */
/* .line 2 */
(( androidx.appcompat.widget.SearchView ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->o()V
return;
} // .end method
public final void p ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;
v0 = android.text.TextUtils .isEmpty ( v0 );
int v1 = 1; // const/4 v1, 0x1
/* xor-int/2addr v0, v1 */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_1 */
/* .line 2 */
/* iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->Q:Z */
if ( v3 != null) { // if-eqz v3, :cond_0
/* iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->e0:Z */
/* if-nez v3, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :cond_1
} // :goto_0
v3 = this.w;
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_2
/* const/16 v2, 0x8 */
} // :goto_1
(( android.widget.ImageView ) v3 ).setVisibility ( v2 ); // invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 4 */
v1 = this.w;
(( android.widget.ImageView ) v1 ).getDrawable ( ); // invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
if ( v1 != null) { // if-eqz v1, :cond_4
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 5 */
v0 = android.view.ViewGroup.ENABLED_STATE_SET;
} // :cond_3
v0 = android.view.ViewGroup.EMPTY_STATE_SET;
} // :goto_2
(( android.graphics.drawable.Drawable ) v1 ).setState ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_4
return;
} // .end method
public void q ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.q;
v0 = (( android.widget.AutoCompleteTextView ) v0 ).hasFocus ( ); // invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->hasFocus()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = android.view.ViewGroup.FOCUSED_STATE_SET;
} // :cond_0
v0 = android.view.ViewGroup.EMPTY_STATE_SET;
/* .line 3 */
} // :goto_0
v1 = this.s;
(( android.view.View ) v1 ).getBackground ( ); // invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
(( android.graphics.drawable.Drawable ) v1 ).setState ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 5 */
} // :cond_1
v1 = this.t;
(( android.view.View ) v1 ).getBackground ( ); // invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 6 */
(( android.graphics.drawable.Drawable ) v1 ).setState ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 7 */
} // :cond_2
(( android.view.ViewGroup ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V
return;
} // .end method
public final void r ( ) {
/* .locals 2 */
/* .line 1 */
(( androidx.appcompat.widget.SearchView ) p0 ).getQueryHint ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getQueryHint()Ljava/lang/CharSequence;
/* .line 2 */
v1 = this.q;
/* if-nez v0, :cond_0 */
final String v0 = ""; // const-string v0, ""
} // :cond_0
(( androidx.appcompat.widget.SearchView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
(( android.widget.AutoCompleteTextView ) v1 ).setHint ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setHint(Ljava/lang/CharSequence;)V
return;
} // .end method
public Boolean requestFocus ( Integer p0, android.graphics.Rect p1 ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->W:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = (( android.view.ViewGroup ) p0 ).isFocusable ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->isFocusable()Z
/* if-nez v0, :cond_1 */
/* .line 3 */
} // :cond_1
v0 = (( androidx.appcompat.widget.SearchView ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->h()Z
/* if-nez v0, :cond_3 */
/* .line 4 */
v0 = this.q;
p1 = (( android.widget.AutoCompleteTextView ) v0 ).requestFocus ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/widget/AutoCompleteTextView;->requestFocus(ILandroid/graphics/Rect;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 5 */
(( androidx.appcompat.widget.SearchView ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SearchView;->b(Z)V
} // :cond_2
/* .line 6 */
} // :cond_3
p1 = /* invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z */
} // .end method
public final void s ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.q;
v1 = this.g0;
v1 = (( android.app.SearchableInfo ) v1 ).getSuggestThreshold ( ); // invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestThreshold()I
(( androidx.appcompat.widget.SearchView$SearchAutoComplete ) v0 ).setThreshold ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setThreshold(I)V
/* .line 2 */
v0 = this.q;
v1 = this.g0;
v1 = (( android.app.SearchableInfo ) v1 ).getImeOptions ( ); // invoke-virtual {v1}, Landroid/app/SearchableInfo;->getImeOptions()I
(( android.widget.AutoCompleteTextView ) v0 ).setImeOptions ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V
/* .line 3 */
v0 = this.g0;
v0 = (( android.app.SearchableInfo ) v0 ).getInputType ( ); // invoke-virtual {v0}, Landroid/app/SearchableInfo;->getInputType()I
/* and-int/lit8 v1, v0, 0xf */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_0 */
/* const v1, -0x10001 */
/* and-int/2addr v0, v1 */
/* .line 4 */
v1 = this.g0;
(( android.app.SearchableInfo ) v1 ).getSuggestAuthority ( ); // invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/high16 v1, 0x10000 */
/* or-int/2addr v0, v1 */
/* const/high16 v1, 0x80000 */
/* or-int/2addr v0, v1 */
/* .line 5 */
} // :cond_0
v1 = this.q;
(( android.widget.AutoCompleteTextView ) v1 ).setInputType ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setInputType(I)V
/* .line 6 */
v0 = this.S;
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
(( c.i.a.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/i/a/c;->b(Landroid/database/Cursor;)V
/* .line 8 */
} // :cond_1
v0 = this.g0;
(( android.app.SearchableInfo ) v0 ).getSuggestAuthority ( ); // invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 9 */
/* new-instance v0, Lc/b/q/f2; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
v3 = this.g0;
v4 = this.k0;
/* invoke-direct {v0, v1, p0, v3, v4}, Lc/b/q/f2;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V */
this.S = v0;
/* .line 10 */
v1 = this.q;
(( android.widget.AutoCompleteTextView ) v1 ).setAdapter ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V
/* .line 11 */
v0 = this.S;
/* check-cast v0, Lc/b/q/f2; */
/* iget-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->V:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
int v2 = 2; // const/4 v2, 0x2
} // :cond_2
(( c.b.q.f2 ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/b/q/f2;->a(I)V
} // :cond_3
return;
} // .end method
public void setAppSearchData ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .line 1 */
this.h0 = p1;
return;
} // .end method
public void setIconified ( Boolean p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( androidx.appcompat.widget.SearchView ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->j()V
/* .line 2 */
} // :cond_0
(( androidx.appcompat.widget.SearchView ) p0 ).k ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->k()V
} // :goto_0
return;
} // .end method
public void setIconifiedByDefault ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->Q:Z */
/* if-ne v0, p1, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->Q:Z */
/* .line 3 */
(( androidx.appcompat.widget.SearchView ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->b(Z)V
/* .line 4 */
(( androidx.appcompat.widget.SearchView ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->r()V
return;
} // .end method
public void setImeOptions ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).setImeOptions ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V
return;
} // .end method
public void setInputType ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).setInputType ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setInputType(I)V
return;
} // .end method
public void setMaxWidth ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/widget/SearchView;->a0:I */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
return;
} // .end method
public void setOnCloseListener ( androidx.appcompat.widget.SearchView$l p0 ) {
/* .locals 0 */
/* .line 1 */
this.M = p1;
return;
} // .end method
public void setOnQueryTextFocusChangeListener ( android.view.View$OnFocusChangeListener p0 ) {
/* .locals 0 */
/* .line 1 */
this.N = p1;
return;
} // .end method
public void setOnQueryTextListener ( androidx.appcompat.widget.SearchView$m p0 ) {
/* .locals 0 */
/* .line 1 */
this.L = p1;
return;
} // .end method
public void setOnSearchClickListener ( android.view.View$OnClickListener p0 ) {
/* .locals 0 */
/* .line 1 */
this.P = p1;
return;
} // .end method
public void setOnSuggestionListener ( androidx.appcompat.widget.SearchView$n p0 ) {
/* .locals 0 */
/* .line 1 */
this.O = p1;
return;
} // .end method
public void setQueryHint ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
this.U = p1;
/* .line 2 */
(( androidx.appcompat.widget.SearchView ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->r()V
return;
} // .end method
public void setQueryRefinementEnabled ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->V:Z */
/* .line 2 */
v0 = this.S;
/* instance-of v1, v0, Lc/b/q/f2; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
/* check-cast v0, Lc/b/q/f2; */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 2; // const/4 p1, 0x2
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_0
(( c.b.q.f2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/f2;->a(I)V
} // :cond_1
return;
} // .end method
public void setSearchableInfo ( android.app.SearchableInfo p0 ) {
/* .locals 1 */
/* .line 1 */
this.g0 = p1;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( androidx.appcompat.widget.SearchView ) p0 ).s ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->s()V
/* .line 3 */
(( androidx.appcompat.widget.SearchView ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->r()V
/* .line 4 */
} // :cond_0
p1 = (( androidx.appcompat.widget.SearchView ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->g()Z
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->b0:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
p1 = this.q;
final String v0 = "nm"; // const-string v0, "nm"
(( android.widget.AutoCompleteTextView ) p1 ).setPrivateImeOptions ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setPrivateImeOptions(Ljava/lang/String;)V
/* .line 6 */
} // :cond_1
p1 = (( androidx.appcompat.widget.SearchView ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->h()Z
(( androidx.appcompat.widget.SearchView ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->b(Z)V
return;
} // .end method
public void setSubmitButtonEnabled ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->T:Z */
/* .line 2 */
p1 = (( androidx.appcompat.widget.SearchView ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->h()Z
(( androidx.appcompat.widget.SearchView ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->b(Z)V
return;
} // .end method
public void setSuggestionsAdapter ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
this.S = p1;
/* .line 2 */
v0 = this.q;
(( android.widget.AutoCompleteTextView ) v0 ).setAdapter ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V
return;
} // .end method
public final void t ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( androidx.appcompat.widget.SearchView ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.v;
/* .line 2 */
v0 = (( android.widget.ImageView ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.x;
/* .line 3 */
v0 = (( android.widget.ImageView ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
/* if-nez v0, :cond_1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
/* const/16 v0, 0x8 */
/* .line 4 */
} // :goto_0
v1 = this.t;
(( android.view.View ) v1 ).setVisibility ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V
return;
} // .end method
