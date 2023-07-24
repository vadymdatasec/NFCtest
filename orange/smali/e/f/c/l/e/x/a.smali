.class public Le/f/c/l/e/x/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/x/b;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Z

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Le/f/c/l/e/x/a;->b:Z

    .line 3
    iput-object p1, p0, Le/f/c/l/e/x/a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/f/c/l/e/x/a;->b:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/c/l/e/x/a;->a:Landroid/content/Context;

    invoke-static {v0}, Le/f/c/l/e/m/j;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/x/a;->c:Ljava/lang/String;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Le/f/c/l/e/x/a;->b:Z

    .line 4
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/x/a;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
