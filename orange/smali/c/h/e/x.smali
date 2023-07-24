.class public Lc/h/e/x;
.super Lc/h/e/d0;
.source "SourceFile"


# instance fields
.field public e:Landroid/graphics/Bitmap;

.field public f:Landroidx/core/graphics/drawable/IconCompat;

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/h/e/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)Lc/h/e/x;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->a(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lc/h/e/x;->f:Landroidx/core/graphics/drawable/IconCompat;

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/h/e/x;->g:Z

    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$BigPictureStyle"

    return-object v0
.end method

.method public a(Lc/h/e/s;)V
    .locals 5

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_6

    .line 4
    new-instance v0, Landroid/app/Notification$BigPictureStyle;

    .line 5
    invoke-interface {p1}, Lc/h/e/s;->a()Landroid/app/Notification$Builder;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/Notification$BigPictureStyle;-><init>(Landroid/app/Notification$Builder;)V

    iget-object v1, p0, Lc/h/e/d0;->b:Ljava/lang/CharSequence;

    .line 6
    invoke-virtual {v0, v1}, Landroid/app/Notification$BigPictureStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v0

    iget-object v1, p0, Lc/h/e/x;->e:Landroid/graphics/Bitmap;

    .line 7
    invoke-virtual {v0, v1}, Landroid/app/Notification$BigPictureStyle;->bigPicture(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v0

    .line 8
    iget-boolean v1, p0, Lc/h/e/x;->g:Z

    if-eqz v1, :cond_4

    .line 9
    iget-object v1, p0, Lc/h/e/x;->f:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 10
    invoke-static {v0, v2}, Lc/h/e/u;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 11
    :cond_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_2

    .line 12
    instance-of v1, p1, Lc/h/e/e0;

    if-eqz v1, :cond_1

    .line 13
    check-cast p1, Lc/h/e/e0;

    invoke-virtual {p1}, Lc/h/e/e0;->d()Landroid/content/Context;

    move-result-object v2

    .line 14
    :cond_1
    iget-object p1, p0, Lc/h/e/x;->f:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {p1, v2}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    invoke-static {v0, p1}, Lc/h/e/v;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->d()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_3

    .line 16
    iget-object p1, p0, Lc/h/e/x;->f:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->a()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {v0, p1}, Lc/h/e/u;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 17
    :cond_3
    invoke-static {v0, v2}, Lc/h/e/u;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/Bitmap;)V

    .line 18
    :cond_4
    :goto_0
    iget-boolean p1, p0, Lc/h/e/d0;->d:Z

    if-eqz p1, :cond_5

    .line 19
    iget-object p1, p0, Lc/h/e/d0;->c:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lc/h/e/u;->a(Landroid/app/Notification$BigPictureStyle;Ljava/lang/CharSequence;)V

    .line 20
    :cond_5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt p1, v1, :cond_6

    .line 21
    iget-boolean p1, p0, Lc/h/e/x;->h:Z

    invoke-static {v0, p1}, Lc/h/e/w;->a(Landroid/app/Notification$BigPictureStyle;Z)V

    :cond_6
    return-void
.end method

.method public b(Landroid/graphics/Bitmap;)Lc/h/e/x;
    .locals 0

    .line 1
    iput-object p1, p0, Lc/h/e/x;->e:Landroid/graphics/Bitmap;

    return-object p0
.end method
