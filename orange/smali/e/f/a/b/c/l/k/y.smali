.class public abstract Le/f/a/b/c/l/k/y;
.super Le/f/a/b/c/l/k/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/a/b/c/l/k/u;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/b/h/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILe/f/a/b/h/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Le/f/a/b/h/h<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Le/f/a/b/c/l/k/u;-><init>(I)V

    .line 2
    iput-object p2, p0, Le/f/a/b/c/l/k/y;->a:Le/f/a/b/h/h;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/y;->a:Le/f/a/b/h/h;

    new-instance v1, Lcom/google/android/gms/common/api/ApiException;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Le/f/a/b/h/h;->b(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final a(Le/f/a/b/c/l/k/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/c/l/k/c<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;
        }
    .end annotation

    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/y;->d(Le/f/a/b/c/l/k/c;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/y;->a(Ljava/lang/RuntimeException;)V

    return-void

    :catch_1
    move-exception p1

    .line 5
    invoke-static {p1}, Le/f/a/b/c/l/k/o;->b(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/y;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :catch_2
    move-exception p1

    .line 6
    invoke-static {p1}, Le/f/a/b/c/l/k/o;->b(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/f/a/b/c/l/k/y;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 7
    throw p1
.end method

.method public a(Ljava/lang/RuntimeException;)V
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/a/b/c/l/k/y;->a:Le/f/a/b/h/h;

    invoke-virtual {v0, p1}, Le/f/a/b/h/h;->b(Ljava/lang/Exception;)Z

    return-void
.end method

.method public abstract d(Le/f/a/b/c/l/k/c;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/c/l/k/c<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
