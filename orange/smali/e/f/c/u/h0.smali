.class public final synthetic Le/f/c/u/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Lcom/google/firebase/iid/FirebaseInstanceId;

.field public final d:Le/f/c/q/r;

.field public final e:Le/f/c/q/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/q/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/u/h0;->a:Landroid/content/Context;

    iput-object p2, p0, Le/f/c/u/h0;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Le/f/c/u/h0;->c:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p4, p0, Le/f/c/u/h0;->d:Le/f/c/q/r;

    iput-object p5, p0, Le/f/c/u/h0;->e:Le/f/c/q/o;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Le/f/c/u/h0;->a:Landroid/content/Context;

    iget-object v1, p0, Le/f/c/u/h0;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Le/f/c/u/h0;->c:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v3, p0, Le/f/c/u/h0;->d:Le/f/c/q/r;

    iget-object v4, p0, Le/f/c/u/h0;->e:Le/f/c/q/o;

    invoke-static {v0, v1, v2, v3, v4}, Le/f/c/u/i0;->a(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/q/o;)Le/f/c/u/i0;

    move-result-object v0

    return-object v0
.end method
