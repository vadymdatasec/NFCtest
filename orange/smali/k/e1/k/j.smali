.class public Lk/e1/k/j;
.super Lk/e1/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lk/e1/k/a;

.field public final synthetic e:Lk/e1/k/x;


# direct methods
.method public varargs constructor <init>(Lk/e1/k/x;Ljava/lang/String;[Ljava/lang/Object;ILk/e1/k/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/j;->e:Lk/e1/k/x;

    iput p4, p0, Lk/e1/k/j;->c:I

    iput-object p5, p0, Lk/e1/k/j;->d:Lk/e1/k/a;

    invoke-direct {p0, p2, p3}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lk/e1/k/j;->e:Lk/e1/k/x;

    iget v1, p0, Lk/e1/k/j;->c:I

    iget-object v2, p0, Lk/e1/k/j;->d:Lk/e1/k/a;

    invoke-virtual {v0, v1, v2}, Lk/e1/k/x;->b(ILk/e1/k/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2
    :catch_0
    iget-object v0, p0, Lk/e1/k/j;->e:Lk/e1/k/x;

    invoke-static {v0}, Lk/e1/k/x;->a(Lk/e1/k/x;)V

    :goto_0
    return-void
.end method
