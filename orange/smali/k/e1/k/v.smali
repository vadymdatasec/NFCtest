.class public Lk/e1/k/v;
.super Lk/e1/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lk/e1/k/k0;

.field public final synthetic d:Lk/e1/k/w;


# direct methods
.method public varargs constructor <init>(Lk/e1/k/w;Ljava/lang/String;[Ljava/lang/Object;Lk/e1/k/k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/v;->d:Lk/e1/k/w;

    iput-object p4, p0, Lk/e1/k/v;->c:Lk/e1/k/k0;

    invoke-direct {p0, p2, p3}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lk/e1/k/v;->d:Lk/e1/k/w;

    iget-object v0, v0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v0, v0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    iget-object v1, p0, Lk/e1/k/v;->c:Lk/e1/k/k0;

    invoke-virtual {v0, v1}, Lk/e1/k/f0;->a(Lk/e1/k/k0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2
    :catch_0
    iget-object v0, p0, Lk/e1/k/v;->d:Lk/e1/k/w;

    iget-object v0, v0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-static {v0}, Lk/e1/k/x;->a(Lk/e1/k/x;)V

    :goto_0
    return-void
.end method
