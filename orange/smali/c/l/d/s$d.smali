.class public Lc/l/d/s$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/n/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/l/d/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/n/q<",
        "Lc/n/j;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lc/l/d/s;


# direct methods
.method public constructor <init>(Lc/l/d/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/s$d;->a:Lc/l/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/n/j;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 2
    iget-object p1, p0, Lc/l/d/s$d;->a:Lc/l/d/s;

    invoke-static {p1}, Lc/l/d/s;->c(Lc/l/d/s;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3
    iget-object p1, p0, Lc/l/d/s$d;->a:Lc/l/d/s;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lc/l/d/s$d;->a:Lc/l/d/s;

    invoke-static {v0}, Lc/l/d/s;->a(Lc/l/d/s;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 6
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DialogFragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " setting the content view on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/s$d;->a:Lc/l/d/s;

    .line 8
    invoke-static {v1}, Lc/l/d/s;->a(Lc/l/d/s;)Landroid/app/Dialog;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    .line 9
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    :cond_0
    iget-object v0, p0, Lc/l/d/s$d;->a:Lc/l/d/s;

    invoke-static {v0}, Lc/l/d/s;->a(Lc/l/d/s;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    goto :goto_0

    .line 11
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "DialogFragment can not be attached to a container view"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    .line 1
    check-cast p1, Lc/n/j;

    invoke-virtual {p0, p1}, Lc/l/d/s$d;->a(Lc/n/j;)V

    return-void
.end method
