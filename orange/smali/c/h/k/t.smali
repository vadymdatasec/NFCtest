.class public Lc/h/k/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/h/m/a;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lc/h/k/u;


# direct methods
.method public constructor <init>(Lc/h/k/u;Lc/h/m/a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/h/k/t;->d:Lc/h/k/u;

    iput-object p2, p0, Lc/h/k/t;->b:Lc/h/m/a;

    iput-object p3, p0, Lc/h/k/t;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/h/k/t;->b:Lc/h/m/a;

    iget-object v1, p0, Lc/h/k/t;->c:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lc/h/m/a;->a(Ljava/lang/Object;)V

    return-void
.end method
