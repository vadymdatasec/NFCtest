public abstract class c.h.n.w0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Method a;
	 /* # direct methods */
	 public static c.h.n.w0 ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* const/16 v1, 0x19 */
		 /* if-ne v0, v1, :cond_0 */
		 /* .line 2 */
		 try { // :try_start_0
			 /* const-class v0, Landroid/view/ViewConfiguration; */
			 final String v1 = "getScaledScrollFactor"; // const-string v1, "getScaledScrollFactor"
			 int v2 = 0; // const/4 v2, 0x0
			 /* new-array v2, v2, [Ljava/lang/Class; */
			 /* .line 3 */
			 (( java.lang.Class ) v0 ).getDeclaredMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 final String v0 = "ViewConfigCompat"; // const-string v0, "ViewConfigCompat"
			 final String v1 = "Could not find method getScaledScrollFactor() on ViewConfiguration"; // const-string v1, "Could not find method getScaledScrollFactor() on ViewConfiguration"
			 /* .line 4 */
			 android.util.Log .i ( v0,v1 );
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
public static Float a ( android.view.ViewConfiguration p0, android.content.Context p1 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* const/16 v1, 0x19 */
	 /* if-lt v0, v1, :cond_0 */
	 v0 = c.h.n.w0.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v1 = 0; // const/4 v1, 0x0
		 try { // :try_start_0
			 /* new-array v1, v1, [Ljava/lang/Object; */
			 /* .line 2 */
			 (( java.lang.reflect.Method ) v0 ).invoke ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast p0, Ljava/lang/Integer; */
			 p0 = 			 (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* int-to-float p0, p0 */
			 /* :catch_0 */
			 final String p0 = "ViewConfigCompat"; // const-string p0, "ViewConfigCompat"
			 final String v0 = "Could not find method getScaledScrollFactor() on ViewConfiguration"; // const-string v0, "Could not find method getScaledScrollFactor() on ViewConfiguration"
			 /* .line 3 */
			 android.util.Log .i ( p0,v0 );
			 /* .line 4 */
		 } // :cond_0
		 /* new-instance p0, Landroid/util/TypedValue; */
		 /* invoke-direct {p0}, Landroid/util/TypedValue;-><init>()V */
		 /* .line 5 */
		 (( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
		 /* const v1, 0x101004d */
		 int v2 = 1; // const/4 v2, 0x1
		 v0 = 		 (( android.content.res.Resources$Theme ) v0 ).resolveAttribute ( v1, p0, v2 ); // invoke-virtual {v0, v1, p0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 6 */
			 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
			 (( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
			 p0 = 			 (( android.util.TypedValue ) p0 ).getDimension ( p1 ); // invoke-virtual {p0, p1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
		 } // :cond_1
		 int p0 = 0; // const/4 p0, 0x0
	 } // .end method
	 public static Integer a ( android.view.ViewConfiguration p0 ) {
		 /* .locals 2 */
		 /* .line 7 */
		 /* const/16 v1, 0x1c */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 8 */
		 p0 = 		 (( android.view.ViewConfiguration ) p0 ).getScaledHoverSlop ( ); // invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledHoverSlop()I
		 /* .line 9 */
	 } // :cond_0
	 p0 = 	 (( android.view.ViewConfiguration ) p0 ).getScaledTouchSlop ( ); // invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
	 /* div-int/lit8 p0, p0, 0x2 */
} // .end method
public static Float b ( android.view.ViewConfiguration p0, android.content.Context p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* const/16 v1, 0x1a */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 2 */
	 p0 = 	 (( android.view.ViewConfiguration ) p0 ).getScaledHorizontalScrollFactor ( ); // invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F
	 /* .line 3 */
} // :cond_0
p0 = c.h.n.w0 .a ( p0,p1 );
} // .end method
public static Float c ( android.view.ViewConfiguration p0, android.content.Context p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1a */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = (( android.view.ViewConfiguration ) p0 ).getScaledVerticalScrollFactor ( ); // invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F
/* .line 3 */
} // :cond_0
p0 = c.h.n.w0 .a ( p0,p1 );
} // .end method
public static Boolean d ( android.view.ViewConfiguration p0, android.content.Context p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = (( android.view.ViewConfiguration ) p0 ).shouldShowMenuShortcutsWhenKeyboardPresent ( ); // invoke-virtual {p0}, Landroid/view/ViewConfiguration;->shouldShowMenuShortcutsWhenKeyboardPresent()Z
/* .line 3 */
} // :cond_0
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
final String p1 = "config_showMenuShortcutsWhenKeyboardPresent"; // const-string p1, "config_showMenuShortcutsWhenKeyboardPresent"
final String v0 = "bool"; // const-string v0, "bool"
final String v1 = "android"; // const-string v1, "android"
/* .line 4 */
p1 = (( android.content.res.Resources ) p0 ).getIdentifier ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
p0 = (( android.content.res.Resources ) p0 ).getBoolean ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z
if ( p0 != null) { // if-eqz p0, :cond_1
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
