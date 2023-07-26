public class c.h.n.d {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.view.View$AccessibilityDelegate c;
	 /* # instance fields */
	 public final android.view.View$AccessibilityDelegate a;
	 public final android.view.View$AccessibilityDelegate b;
	 /* # direct methods */
	 public static c.h.n.d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/view/View$AccessibilityDelegate; */
		 /* invoke-direct {v0}, Landroid/view/View$AccessibilityDelegate;-><init>()V */
		 return;
	 } // .end method
	 public c.h.n.d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = c.h.n.d.c;
		 /* invoke-direct {p0, v0}, Lc/h/n/d;-><init>(Landroid/view/View$AccessibilityDelegate;)V */
		 return;
	 } // .end method
	 public c.h.n.d ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 3 */
		 this.a = p1;
		 /* .line 4 */
		 /* new-instance p1, Lc/h/n/c; */
		 /* invoke-direct {p1, p0}, Lc/h/n/c;-><init>(Lc/h/n/d;)V */
		 this.b = p1;
		 return;
	 } // .end method
	 public static java.util.List b ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/view/View;", */
		 /* ")", */
		 /* "Ljava/util/List<", */
		 /* "Lc/h/n/v1/f;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 /* .line 3 */
	 (( android.view.View ) p0 ).getTag ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
	 /* check-cast p0, Ljava/util/List; */
	 /* if-nez p0, :cond_0 */
	 /* .line 4 */
	 java.util.Collections .emptyList ( );
} // :cond_0
} // .end method
/* # virtual methods */
public android.view.View$AccessibilityDelegate a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public c.h.n.v1.i a ( android.view.View p0 ) {
/* .locals 2 */
/* .line 8 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 9 */
v0 = this.a;
(( android.view.View$AccessibilityDelegate ) v0 ).getAccessibilityNodeProvider ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 10 */
	 /* new-instance v0, Lc/h/n/v1/i; */
	 /* invoke-direct {v0, p1}, Lc/h/n/v1/i;-><init>(Ljava/lang/Object;)V */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.a;
(( android.view.View$AccessibilityDelegate ) v0 ).sendAccessibilityEvent ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V
return;
} // .end method
public void a ( android.view.View p0, Object p1 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.a;
/* .line 5 */
(( c.h.n.v1.h ) p2 ).u ( ); // invoke-virtual {p2}, Lc/h/n/v1/h;->u()Landroid/view/accessibility/AccessibilityNodeInfo;
/* .line 6 */
(( android.view.View$AccessibilityDelegate ) v0 ).onInitializeAccessibilityNodeInfo ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
return;
} // .end method
public final Boolean a ( Integer p0, android.view.View p1 ) {
/* .locals 1 */
/* .line 21 */
/* .line 22 */
(( android.view.View ) p2 ).getTag ( v0 ); // invoke-virtual {p2, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* check-cast v0, Landroid/util/SparseArray; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 23 */
	 (( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
	 /* check-cast p1, Ljava/lang/ref/WeakReference; */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 24 */
		 (( java.lang.ref.WeakReference ) p1 ).get ( ); // invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
		 /* check-cast p1, Landroid/text/style/ClickableSpan; */
		 /* .line 25 */
		 v0 = 		 (( c.h.n.d ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/h/n/d;->a(Landroid/text/style/ClickableSpan;Landroid/view/View;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 26 */
			 (( android.text.style.ClickableSpan ) p1 ).onClick ( p2 ); // invoke-virtual {p1, p2}, Landroid/text/style/ClickableSpan;->onClick(Landroid/view/View;)V
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public final Boolean a ( android.text.style.ClickableSpan p0, android.view.View p1 ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 27 */
			 (( android.view.View ) p2 ).createAccessibilityNodeInfo ( ); // invoke-virtual {p2}, Landroid/view/View;->createAccessibilityNodeInfo()Landroid/view/accessibility/AccessibilityNodeInfo;
			 /* .line 28 */
			 (( android.view.accessibility.AccessibilityNodeInfo ) p2 ).getText ( ); // invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;
			 c.h.n.v1.h .d ( p2 );
			 int v1 = 0; // const/4 v1, 0x0
		 } // :goto_0
		 if ( p2 != null) { // if-eqz p2, :cond_1
			 /* .line 29 */
			 /* array-length v2, p2 */
			 /* if-ge v1, v2, :cond_1 */
			 /* .line 30 */
			 /* aget-object v2, p2, v1 */
			 v2 = 			 (( java.lang.Object ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 int p1 = 1; // const/4 p1, 0x1
			 } // :cond_0
			 /* add-int/lit8 v1, v1, 0x1 */
		 } // :cond_1
	 } // .end method
	 public Boolean a ( android.view.View p0, Integer p1, android.os.Bundle p2 ) {
		 /* .locals 5 */
		 /* .line 11 */
		 c.h.n.d .b ( p1 );
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 12 */
	 v3 = 	 } // :goto_0
	 /* if-ge v2, v3, :cond_1 */
	 /* .line 13 */
	 /* check-cast v3, Lc/h/n/v1/f; */
	 /* .line 14 */
	 v4 = 	 (( c.h.n.v1.f ) v3 ).a ( ); // invoke-virtual {v3}, Lc/h/n/v1/f;->a()I
	 /* if-ne v4, p2, :cond_0 */
	 /* .line 15 */
	 v1 = 	 (( c.h.n.v1.f ) v3 ).a ( p1, p3 ); // invoke-virtual {v3, p1, p3}, Lc/h/n/v1/f;->a(Landroid/view/View;Landroid/os/Bundle;)Z
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // :goto_1
/* if-nez v1, :cond_2 */
/* .line 16 */
/* const/16 v2, 0x10 */
/* if-lt v0, v2, :cond_2 */
/* .line 17 */
v0 = this.a;
v1 = (( android.view.View$AccessibilityDelegate ) v0 ).performAccessibilityAction ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
} // :cond_2
/* if-nez v1, :cond_3 */
/* .line 18 */
/* if-ne p2, v0, :cond_3 */
int p2 = -1; // const/4 p2, -0x1
final String v0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"; // const-string v0, "ACCESSIBILITY_CLICKABLE_SPAN_ID"
/* .line 19 */
p2 = (( android.os.Bundle ) p3 ).getInt ( v0, p2 ); // invoke-virtual {p3, v0, p2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* .line 20 */
v1 = (( c.h.n.d ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Lc/h/n/d;->a(ILandroid/view/View;)Z
} // :cond_3
} // .end method
public Boolean a ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.a;
p1 = (( android.view.View$AccessibilityDelegate ) v0 ).dispatchPopulateAccessibilityEvent ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
} // .end method
public Boolean a ( android.view.ViewGroup p0, android.view.View p1, android.view.accessibility.AccessibilityEvent p2 ) {
/* .locals 1 */
/* .line 7 */
v0 = this.a;
p1 = (( android.view.View$AccessibilityDelegate ) v0 ).onRequestSendAccessibilityEvent ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
} // .end method
public void b ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.view.View$AccessibilityDelegate ) v0 ).onInitializeAccessibilityEvent ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
return;
} // .end method
public void c ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.view.View$AccessibilityDelegate ) v0 ).onPopulateAccessibilityEvent ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
return;
} // .end method
public void d ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.view.View$AccessibilityDelegate ) v0 ).sendAccessibilityEventUnchecked ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
return;
} // .end method
