.class public Lc/l/d/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/a/k/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/a/k/c<",
        "Lc/a/k/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lc/l/d/o1;


# direct methods
.method public constructor <init>(Lc/l/d/o1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/w0;->a:Lc/l/d/o1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/k/b;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lc/l/d/w0;->a:Lc/l/d/o1;

    iget-object v0, v0, Lc/l/d/o1;->C:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/l/d/j1;

    const-string v1, "FragmentManager"

    if-nez v0, :cond_0

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "No IntentSenders were started for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 4
    :cond_0
    iget-object v2, v0, Lc/l/d/j1;->b:Ljava/lang/String;

    .line 5
    iget v0, v0, Lc/l/d/j1;->c:I

    .line 6
    iget-object v3, p0, Lc/l/d/w0;->a:Lc/l/d/o1;

    invoke-static {v3}, Lc/l/d/o1;->c(Lc/l/d/o1;)Lc/l/d/c2;

    move-result-object v3

    invoke-virtual {v3, v2}, Lc/l/d/c2;->d(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    if-nez v3, :cond_1

    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Intent Sender result delivered for unknown Fragment "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 8
    :cond_1
    invoke-virtual {p1}, Lc/a/k/b;->b()I

    move-result v1

    .line 9
    invoke-virtual {p1}, Lc/a/k/b;->a()Landroid/content/Intent;

    move-result-object p1

    .line 10
    invoke-virtual {v3, v0, v1, p1}, Landroidx/fragment/app/Fragment;->a(IILandroid/content/Intent;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lc/a/k/b;

    invoke-virtual {p0, p1}, Lc/l/d/w0;->a(Lc/a/k/b;)V

    return-void
.end method
