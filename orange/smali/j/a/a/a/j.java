public abstract class j.a.a.a.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 final String v0 = "window"; // const-string v0, "window"
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast p0, Landroid/view/WindowManager; */
		 /* .line 2 */
		 /* .line 3 */
		 v0 = 		 (( android.view.Display ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/Display;->getWidth()I
		 v1 = 		 (( android.view.Display ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/Display;->getHeight()I
		 /* if-ne v0, v1, :cond_0 */
		 int p0 = 3; // const/4 p0, 0x3
		 /* .line 4 */
	 } // :cond_0
	 v0 = 	 (( android.view.Display ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/Display;->getWidth()I
	 p0 = 	 (( android.view.Display ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/Display;->getHeight()I
	 /* if-ge v0, p0, :cond_1 */
	 int p0 = 1; // const/4 p0, 0x1
} // :cond_1
int p0 = 2; // const/4 p0, 0x2
} // :goto_0
} // .end method
