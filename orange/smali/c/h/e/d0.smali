.class public abstract Lc/h/e/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lc/h/e/c0$a;

.field public b:Ljava/lang/CharSequence;

.field public c:Ljava/lang/CharSequence;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lc/h/e/d0;->d:Z

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 4
    iget-boolean v0, p0, Lc/h/e/d0;->d:Z

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lc/h/e/d0;->c:Ljava/lang/CharSequence;

    const-string v1, "android.summaryText"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lc/h/e/d0;->b:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    const-string v1, "android.title.big"

    .line 7
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 8
    :cond_1
    invoke-virtual {p0}, Lc/h/e/d0;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "androidx.core.app.extra.COMPAT_TEMPLATE"

    .line 9
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public a(Lc/h/e/c0$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/e/d0;->a:Lc/h/e/c0$a;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lc/h/e/d0;->a:Lc/h/e/c0$a;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Lc/h/e/c0$a;->a(Lc/h/e/d0;)Lc/h/e/c0$a;

    :cond_0
    return-void
.end method

.method public abstract a(Lc/h/e/s;)V
.end method

.method public b(Lc/h/e/s;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Lc/h/e/s;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Lc/h/e/s;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
