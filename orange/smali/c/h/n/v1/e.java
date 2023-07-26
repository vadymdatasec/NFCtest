public abstract class c.h.n.v1.e {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( android.view.accessibility.AccessibilityManager p0, Object p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/16 v2, 0x13 */
		 /* if-lt v0, v2, :cond_1 */
		 /* if-nez p1, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance v0, Lc/h/n/v1/d; */
	 /* invoke-direct {v0, p1}, Lc/h/n/v1/d;-><init>(Lc/h/n/v1/c;)V */
	 p0 = 	 (( android.view.accessibility.AccessibilityManager ) p0 ).addTouchExplorationStateChangeListener ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z
} // :cond_1
} // .end method
public static Boolean b ( android.view.accessibility.AccessibilityManager p0, Object p1 ) {
/* .locals 3 */
/* .line 1 */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x13 */
/* if-lt v0, v2, :cond_1 */
/* if-nez p1, :cond_0 */
/* .line 2 */
} // :cond_0
/* new-instance v0, Lc/h/n/v1/d; */
/* invoke-direct {v0, p1}, Lc/h/n/v1/d;-><init>(Lc/h/n/v1/c;)V */
p0 = (( android.view.accessibility.AccessibilityManager ) p0 ).removeTouchExplorationStateChangeListener ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z
} // :cond_1
} // .end method
