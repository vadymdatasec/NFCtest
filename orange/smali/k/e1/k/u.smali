.class public Lk/e1/k/u;
.super Lk/e1/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lk/e1/k/w;


# direct methods
.method public varargs constructor <init>(Lk/e1/k/w;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/u;->c:Lk/e1/k/w;

    invoke-direct {p0, p2, p3}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk/e1/k/u;->c:Lk/e1/k/w;

    iget-object v0, v0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v1, v0, Lk/e1/k/x;->c:Lk/e1/k/r;

    invoke-virtual {v1, v0}, Lk/e1/k/r;->a(Lk/e1/k/x;)V

    return-void
.end method
