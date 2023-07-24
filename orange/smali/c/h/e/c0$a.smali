.class public Lc/h/e/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/h/e/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public A:Z

.field public B:Z

.field public C:Ljava/lang/String;

.field public D:Landroid/os/Bundle;

.field public E:I

.field public F:I

.field public G:Landroid/app/Notification;

.field public H:Landroid/widget/RemoteViews;

.field public I:Landroid/widget/RemoteViews;

.field public J:Landroid/widget/RemoteViews;

.field public K:Ljava/lang/String;

.field public L:I

.field public M:Ljava/lang/String;

.field public N:Lc/h/f/g;

.field public O:J

.field public P:I

.field public Q:I

.field public R:Z

.field public S:Lc/h/e/b0;

.field public T:Landroid/app/Notification;

.field public U:Z

.field public V:Landroid/graphics/drawable/Icon;

.field public W:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public a:Landroid/content/Context;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/h/e/t;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/h/e/g0;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/h/e/t;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Landroid/app/PendingIntent;

.field public h:Landroid/app/PendingIntent;

.field public i:Landroid/widget/RemoteViews;

.field public j:Landroid/graphics/Bitmap;

.field public k:Ljava/lang/CharSequence;

.field public l:I

.field public m:I

.field public n:Z

.field public o:Z

.field public p:Lc/h/e/d0;

.field public q:Ljava/lang/CharSequence;

.field public r:Ljava/lang/CharSequence;

.field public s:[Ljava/lang/CharSequence;

.field public t:I

.field public u:I

.field public v:Z

.field public w:Ljava/lang/String;

.field public x:Z

.field public y:Ljava/lang/String;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, v0}, Lc/h/e/c0$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/h/e/c0$a;->b:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/h/e/c0$a;->c:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/h/e/c0$a;->d:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lc/h/e/c0$a;->n:Z

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lc/h/e/c0$a;->z:Z

    .line 7
    iput v1, p0, Lc/h/e/c0$a;->E:I

    .line 8
    iput v1, p0, Lc/h/e/c0$a;->F:I

    .line 9
    iput v1, p0, Lc/h/e/c0$a;->L:I

    .line 10
    iput v1, p0, Lc/h/e/c0$a;->P:I

    .line 11
    iput v1, p0, Lc/h/e/c0$a;->Q:I

    .line 12
    new-instance v2, Landroid/app/Notification;

    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    iput-object v2, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    .line 13
    iput-object p1, p0, Lc/h/e/c0$a;->a:Landroid/content/Context;

    .line 14
    iput-object p2, p0, Lc/h/e/c0$a;->K:Ljava/lang/String;

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v2, Landroid/app/Notification;->when:J

    .line 16
    iget-object p1, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    const/4 p2, -0x1

    iput p2, p1, Landroid/app/Notification;->audioStreamType:I

    .line 17
    iput v1, p0, Lc/h/e/c0$a;->m:I

    .line 18
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lc/h/e/c0$a;->W:Ljava/util/ArrayList;

    .line 19
    iput-boolean v0, p0, Lc/h/e/c0$a;->R:Z

    return-void
.end method

.method public static d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    .line 3
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1400

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    .line 4
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public a()Landroid/app/Notification;
    .locals 1

    .line 42
    new-instance v0, Lc/h/e/e0;

    invoke-direct {v0, p0}, Lc/h/e/e0;-><init>(Lc/h/e/c0$a;)V

    invoke-virtual {v0}, Lc/h/e/e0;->b()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 9

    if-eqz p1, :cond_2

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lc/h/e/c0$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 8
    sget v1, Lc/h/b;->compat_notification_large_icon_max_width:I

    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 10
    sget v2, Lc/h/b;->compat_notification_large_icon_max_height:I

    .line 11
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 12
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-gt v2, v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-gt v2, v0, :cond_1

    return-object p1

    :cond_1
    int-to-double v1, v1

    .line 13
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/4 v4, 0x1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-double v5, v3

    div-double/2addr v1, v5

    int-to-double v5, v0

    .line 14
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v7, v0

    div-double/2addr v5, v7

    .line 15
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    .line 16
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v2, v2

    mul-double v2, v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 17
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-double v5, v3

    mul-double v5, v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 18
    invoke-static {p1, v2, v0, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method public a(I)Lc/h/e/c0$a;
    .locals 0

    .line 39
    iput p1, p0, Lc/h/e/c0$a;->E:I

    return-object p0
.end method

.method public a(III)Lc/h/e/c0$a;
    .locals 1

    .line 27
    iget-object v0, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->ledARGB:I

    .line 28
    iput p2, v0, Landroid/app/Notification;->ledOnMS:I

    .line 29
    iput p3, v0, Landroid/app/Notification;->ledOffMS:I

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    iget-object p2, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    iget p3, p2, Landroid/app/Notification;->flags:I

    and-int/lit8 p3, p3, -0x2

    or-int/2addr p1, p3

    .line 31
    iput p1, p2, Landroid/app/Notification;->flags:I

    return-object p0
.end method

.method public a(IIZ)Lc/h/e/c0$a;
    .locals 0

    .line 2
    iput p1, p0, Lc/h/e/c0$a;->t:I

    .line 3
    iput p2, p0, Lc/h/e/c0$a;->u:I

    .line 4
    iput-boolean p3, p0, Lc/h/e/c0$a;->v:Z

    return-object p0
.end method

.method public a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lc/h/e/c0$a;
    .locals 2

    .line 35
    iget-object v0, p0, Lc/h/e/c0$a;->b:Ljava/util/ArrayList;

    new-instance v1, Lc/h/e/t;

    invoke-direct {v1, p1, p2, p3}, Lc/h/e/t;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(J)Lc/h/e/c0$a;
    .locals 0

    .line 41
    iput-wide p1, p0, Lc/h/e/c0$a;->O:J

    return-object p0
.end method

.method public a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;
    .locals 0

    .line 5
    iput-object p1, p0, Lc/h/e/c0$a;->g:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public a(Landroid/net/Uri;)Lc/h/e/c0$a;
    .locals 2

    .line 19
    iget-object v0, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    const/4 p1, -0x1

    .line 20
    iput p1, v0, Landroid/app/Notification;->audioStreamType:I

    .line 21
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt p1, v1, :cond_0

    .line 22
    new-instance p1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x4

    .line 23
    invoke-virtual {p1, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v1, 0x5

    .line 24
    invoke-virtual {p1, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    .line 25
    invoke-virtual {p1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    :cond_0
    return-object p0
.end method

.method public a(Lc/h/e/d0;)Lc/h/e/c0$a;
    .locals 1

    .line 36
    iget-object v0, p0, Lc/h/e/c0$a;->p:Lc/h/e/d0;

    if-eq v0, p1, :cond_0

    .line 37
    iput-object p1, p0, Lc/h/e/c0$a;->p:Lc/h/e/d0;

    if-eqz p1, :cond_0

    .line 38
    invoke-virtual {p1, p0}, Lc/h/e/d0;->a(Lc/h/e/c0$a;)V

    :cond_0
    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;)Lc/h/e/c0$a;
    .locals 0

    .line 1
    invoke-static {p1}, Lc/h/e/c0$a;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lc/h/e/c0$a;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lc/h/e/c0$a;
    .locals 0

    .line 40
    iput-object p1, p0, Lc/h/e/c0$a;->K:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lc/h/e/c0$a;
    .locals 1

    const/16 v0, 0x10

    .line 32
    invoke-virtual {p0, v0, p1}, Lc/h/e/c0$a;->a(IZ)V

    return-object p0
.end method

.method public a([J)Lc/h/e/c0$a;
    .locals 1

    .line 26
    iget-object v0, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->vibrate:[J

    return-object p0
.end method

.method public final a(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    .line 33
    iget-object p2, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    or-int/2addr p1, v0

    iput p1, p2, Landroid/app/Notification;->flags:I

    goto :goto_0

    .line 34
    :cond_0
    iget-object p2, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    not-int p1, p1

    and-int/2addr p1, v0

    iput p1, p2, Landroid/app/Notification;->flags:I

    :goto_0
    return-void
.end method

.method public b()Landroid/os/Bundle;
    .locals 1

    .line 9
    iget-object v0, p0, Lc/h/e/c0$a;->D:Landroid/os/Bundle;

    if-nez v0, :cond_0

    .line 10
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lc/h/e/c0$a;->D:Landroid/os/Bundle;

    .line 11
    :cond_0
    iget-object v0, p0, Lc/h/e/c0$a;->D:Landroid/os/Bundle;

    return-object v0
.end method

.method public b(I)Lc/h/e/c0$a;
    .locals 1

    .line 5
    iget-object v0, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    .line 6
    iget p1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Landroid/app/Notification;->flags:I

    :cond_0
    return-object p0
.end method

.method public b(J)Lc/h/e/c0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    iput-wide p1, v0, Landroid/app/Notification;->when:J

    return-object p0
.end method

.method public b(Landroid/app/PendingIntent;)Lc/h/e/c0$a;
    .locals 1

    .line 3
    iget-object v0, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public b(Landroid/graphics/Bitmap;)Lc/h/e/c0$a;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lc/h/e/c0$a;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lc/h/e/c0$a;->j:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;
    .locals 0

    .line 2
    invoke-static {p1}, Lc/h/e/c0$a;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lc/h/e/c0$a;->e:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lc/h/e/c0$a;
    .locals 0

    .line 7
    iput-object p1, p0, Lc/h/e/c0$a;->w:Ljava/lang/String;

    return-object p0
.end method

.method public b(Z)Lc/h/e/c0$a;
    .locals 0

    .line 8
    iput-boolean p1, p0, Lc/h/e/c0$a;->x:Z

    return-object p0
.end method

.method public c(I)Lc/h/e/c0$a;
    .locals 0

    .line 1
    iput p1, p0, Lc/h/e/c0$a;->l:I

    return-object p0
.end method

.method public c(Ljava/lang/CharSequence;)Lc/h/e/c0$a;
    .locals 1

    .line 2
    iget-object v0, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    invoke-static {p1}, Lc/h/e/c0$a;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lc/h/e/c0$a;
    .locals 0

    .line 4
    iput-object p1, p0, Lc/h/e/c0$a;->y:Ljava/lang/String;

    return-object p0
.end method

.method public c(Z)Lc/h/e/c0$a;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lc/h/e/c0$a;->z:Z

    return-object p0
.end method

.method public d(I)Lc/h/e/c0$a;
    .locals 0

    .line 2
    iput p1, p0, Lc/h/e/c0$a;->m:I

    return-object p0
.end method

.method public d(Z)Lc/h/e/c0$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/h/e/c0$a;->n:Z

    return-object p0
.end method

.method public e(I)Lc/h/e/c0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/e/c0$a;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->icon:I

    return-object p0
.end method

.method public f(I)Lc/h/e/c0$a;
    .locals 0

    .line 1
    iput p1, p0, Lc/h/e/c0$a;->F:I

    return-object p0
.end method
