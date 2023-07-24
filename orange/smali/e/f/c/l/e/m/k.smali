.class public Le/f/c/l/e/m/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/c/l/e/m/o;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/k;->b:Le/f/c/l/e/m/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/k;->b:Le/f/c/l/e/m/o;

    invoke-static {v0}, Le/f/c/l/e/m/o;->a(Le/f/c/l/e/m/o;)Ljava/lang/ThreadLocal;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
