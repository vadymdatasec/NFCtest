.class public final Le/b/a/y/x/g1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:I


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/app/ActivityManager;

.field public c:Le/b/a/y/x/g1/r;

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    sput v0, Le/b/a/y/x/g1/p;->i:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    iput v0, p0, Le/b/a/y/x/g1/p;->d:F

    .line 3
    sget v0, Le/b/a/y/x/g1/p;->i:I

    int-to-float v0, v0

    iput v0, p0, Le/b/a/y/x/g1/p;->e:F

    const v0, 0x3ecccccd    # 0.4f

    .line 4
    iput v0, p0, Le/b/a/y/x/g1/p;->f:F

    const v0, 0x3ea8f5c3    # 0.33f

    .line 5
    iput v0, p0, Le/b/a/y/x/g1/p;->g:F

    const/high16 v0, 0x400000

    .line 6
    iput v0, p0, Le/b/a/y/x/g1/p;->h:I

    .line 7
    iput-object p1, p0, Le/b/a/y/x/g1/p;->a:Landroid/content/Context;

    const-string v0, "activity"

    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    iput-object v0, p0, Le/b/a/y/x/g1/p;->b:Landroid/app/ActivityManager;

    .line 9
    new-instance v0, Le/b/a/y/x/g1/q;

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    invoke-direct {v0, p1}, Le/b/a/y/x/g1/q;-><init>(Landroid/util/DisplayMetrics;)V

    iput-object v0, p0, Le/b/a/y/x/g1/p;->c:Le/b/a/y/x/g1/r;

    .line 11
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_0

    iget-object p1, p0, Le/b/a/y/x/g1/p;->b:Landroid/app/ActivityManager;

    invoke-static {p1}, Le/b/a/y/x/g1/s;->a(Landroid/app/ActivityManager;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 12
    iput p1, p0, Le/b/a/y/x/g1/p;->e:F

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Le/b/a/y/x/g1/s;
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/x/g1/s;

    invoke-direct {v0, p0}, Le/b/a/y/x/g1/s;-><init>(Le/b/a/y/x/g1/p;)V

    return-object v0
.end method
