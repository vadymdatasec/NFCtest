.class public final Le/f/c/l/e/m/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Le/f/c/l/e/t/g/d;

.field public final d:Le/f/c/l/e/t/f;

.field public final e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/f/c/l/e/t/g/d;Le/f/c/l/e/t/f;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/m/t0;->b:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/f/c/l/e/m/t0;->c:Le/f/c/l/e/t/g/d;

    .line 4
    iput-object p3, p0, Le/f/c/l/e/m/t0;->d:Le/f/c/l/e/t/f;

    .line 5
    iput-boolean p4, p0, Le/f/c/l/e/m/t0;->e:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/t0;->b:Landroid/content/Context;

    invoke-static {v0}, Le/f/c/l/e/m/j;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Attempting to send crash report at time of crash..."

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Le/f/c/l/e/m/t0;->d:Le/f/c/l/e/t/f;

    iget-object v1, p0, Le/f/c/l/e/m/t0;->c:Le/f/c/l/e/t/g/d;

    iget-boolean v2, p0, Le/f/c/l/e/m/t0;->e:Z

    invoke-virtual {v0, v1, v2}, Le/f/c/l/e/t/f;->a(Le/f/c/l/e/t/g/d;Z)Z

    return-void
.end method
