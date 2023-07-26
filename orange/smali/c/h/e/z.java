public abstract class c.h.e.z {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.app.Notification$BubbleMetadata a ( c.h.e.b0 p0 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-nez p0, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 (( c.h.e.b0 ) p0 ).f ( ); // invoke-virtual {p0}, Lc/h/e/b0;->f()Landroid/app/PendingIntent;
	 /* if-nez v1, :cond_1 */
	 /* .line 2 */
} // :cond_1
/* new-instance v0, Landroid/app/Notification$BubbleMetadata$Builder; */
/* invoke-direct {v0}, Landroid/app/Notification$BubbleMetadata$Builder;-><init>()V */
/* .line 3 */
(( c.h.e.b0 ) p0 ).e ( ); // invoke-virtual {p0}, Lc/h/e/b0;->e()Landroidx/core/graphics/drawable/IconCompat;
(( androidx.core.graphics.drawable.IconCompat ) v1 ).g ( ); // invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->g()Landroid/graphics/drawable/Icon;
(( android.app.Notification$BubbleMetadata$Builder ) v0 ).setIcon ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$BubbleMetadata$Builder;
/* .line 4 */
(( c.h.e.b0 ) p0 ).f ( ); // invoke-virtual {p0}, Lc/h/e/b0;->f()Landroid/app/PendingIntent;
(( android.app.Notification$BubbleMetadata$Builder ) v0 ).setIntent ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$BubbleMetadata$Builder;
/* .line 5 */
(( c.h.e.b0 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/e/b0;->b()Landroid/app/PendingIntent;
(( android.app.Notification$BubbleMetadata$Builder ) v0 ).setDeleteIntent ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$BubbleMetadata$Builder;
/* .line 6 */
v1 = (( c.h.e.b0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/e/b0;->a()Z
(( android.app.Notification$BubbleMetadata$Builder ) v0 ).setAutoExpandBubble ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setAutoExpandBubble(Z)Landroid/app/Notification$BubbleMetadata$Builder;
/* .line 7 */
v1 = (( c.h.e.b0 ) p0 ).h ( ); // invoke-virtual {p0}, Lc/h/e/b0;->h()Z
(( android.app.Notification$BubbleMetadata$Builder ) v0 ).setSuppressNotification ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setSuppressNotification(Z)Landroid/app/Notification$BubbleMetadata$Builder;
/* .line 8 */
v1 = (( c.h.e.b0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/e/b0;->c()I
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 9 */
	 v1 = 	 (( c.h.e.b0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/e/b0;->c()I
	 (( android.app.Notification$BubbleMetadata$Builder ) v0 ).setDesiredHeight ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setDesiredHeight(I)Landroid/app/Notification$BubbleMetadata$Builder;
	 /* .line 10 */
} // :cond_2
v1 = (( c.h.e.b0 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/e/b0;->d()I
if ( v1 != null) { // if-eqz v1, :cond_3
	 /* .line 11 */
	 p0 = 	 (( c.h.e.b0 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/e/b0;->d()I
	 /* .line 12 */
	 (( android.app.Notification$BubbleMetadata$Builder ) v0 ).setDesiredHeightResId ( p0 ); // invoke-virtual {v0, p0}, Landroid/app/Notification$BubbleMetadata$Builder;->setDesiredHeightResId(I)Landroid/app/Notification$BubbleMetadata$Builder;
	 /* .line 13 */
} // :cond_3
(( android.app.Notification$BubbleMetadata$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/app/Notification$BubbleMetadata$Builder;->build()Landroid/app/Notification$BubbleMetadata;
} // .end method
