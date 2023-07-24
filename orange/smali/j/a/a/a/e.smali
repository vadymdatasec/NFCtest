.class public Lj/a/a/a/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lj/a/a/a/g;


# direct methods
.method public constructor <init>(Lj/a/a/a/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj/a/a/a/e;->b:Lj/a/a/a/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj/a/a/a/e;->b:Lj/a/a/a/g;

    invoke-static {v0}, Lj/a/a/a/g;->a(Lj/a/a/a/g;)Lj/a/a/a/i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/a/a/a/e;->b:Lj/a/a/a/g;

    invoke-static {v0}, Lj/a/a/a/g;->b(Lj/a/a/a/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/a/a/a/e;->b:Lj/a/a/a/g;

    invoke-static {v0}, Lj/a/a/a/g;->c(Lj/a/a/a/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/a/a/a/e;->b:Lj/a/a/a/g;

    invoke-static {v0}, Lj/a/a/a/g;->d(Lj/a/a/a/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lj/a/a/a/e;->b:Lj/a/a/a/g;

    invoke-virtual {v0}, Lj/a/a/a/g;->a()V

    :cond_0
    return-void
.end method
