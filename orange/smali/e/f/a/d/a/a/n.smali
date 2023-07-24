.class public final Le/f/a/d/a/a/n;
.super Le/f/a/d/a/a/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/a/d/a/a/m<",
        "Le/f/a/d/a/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:Ljava/lang/String;

.field public final synthetic e:Le/f/a/d/a/a/o;


# direct methods
.method public constructor <init>(Le/f/a/d/a/a/o;Le/f/a/d/a/i/o;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/i/o<",
            "Le/f/a/d/a/a/a;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Le/f/a/d/a/a/n;->e:Le/f/a/d/a/a/o;

    new-instance v0, Le/f/a/d/a/e/a;

    const-string v1, "OnRequestInstallCallback"

    invoke-direct {v0, v1}, Le/f/a/d/a/e/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, p2}, Le/f/a/d/a/a/m;-><init>(Le/f/a/d/a/a/o;Le/f/a/d/a/e/a;Le/f/a/d/a/i/o;)V

    iput-object p3, p0, Le/f/a/d/a/a/n;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final g(Landroid/os/Bundle;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-super {p0, p1}, Le/f/a/d/a/a/m;->g(Landroid/os/Bundle;)V

    invoke-static {p1}, Le/f/a/d/a/a/o;->a(Landroid/os/Bundle;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/f/a/d/a/a/m;->b:Le/f/a/d/a/i/o;

    new-instance v1, Lcom/google/android/play/core/install/InstallException;

    invoke-static {p1}, Le/f/a/d/a/a/o;->a(Landroid/os/Bundle;)I

    move-result p1

    invoke-direct {v1, p1}, Lcom/google/android/play/core/install/InstallException;-><init>(I)V

    invoke-virtual {v0, v1}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v0, p0, Le/f/a/d/a/a/m;->b:Le/f/a/d/a/i/o;

    iget-object v1, p0, Le/f/a/d/a/a/n;->e:Le/f/a/d/a/a/o;

    iget-object v2, p0, Le/f/a/d/a/a/n;->d:Ljava/lang/String;

    invoke-static {v1, p1, v2}, Le/f/a/d/a/a/o;->a(Le/f/a/d/a/a/o;Landroid/os/Bundle;Ljava/lang/String;)Le/f/a/d/a/a/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/a/d/a/i/o;->b(Ljava/lang/Object;)V

    return-void
.end method
