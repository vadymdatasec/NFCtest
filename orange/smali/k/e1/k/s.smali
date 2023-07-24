.class public final Lk/e1/k/s;
.super Lk/e1/b;
.source "SourceFile"


# instance fields
.field public final c:Z

.field public final d:I

.field public final e:I

.field public final synthetic f:Lk/e1/k/x;


# direct methods
.method public constructor <init>(Lk/e1/k/x;ZII)V
    .locals 2

    .line 1
    iput-object p1, p0, Lk/e1/k/s;->f:Lk/e1/k/x;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lk/e1/k/x;->e:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s ping %08x%08x"

    invoke-direct {p0, p1, v0}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    iput-boolean p2, p0, Lk/e1/k/s;->c:Z

    .line 4
    iput p3, p0, Lk/e1/k/s;->d:I

    .line 5
    iput p4, p0, Lk/e1/k/s;->e:I

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk/e1/k/s;->f:Lk/e1/k/x;

    iget-boolean v1, p0, Lk/e1/k/s;->c:Z

    iget v2, p0, Lk/e1/k/s;->d:I

    iget v3, p0, Lk/e1/k/s;->e:I

    invoke-virtual {v0, v1, v2, v3}, Lk/e1/k/x;->a(ZII)V

    return-void
.end method
