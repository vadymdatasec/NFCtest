.class public abstract Le/b/a/y/z/e/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/b/a/y/z/e/u;

.field public static final b:Le/b/a/y/z/e/u;

.field public static final c:Le/b/a/y/z/e/u;

.field public static final d:Le/b/a/y/z/e/u;

.field public static final e:Le/b/a/y/z/e/u;

.field public static final f:Le/b/a/y/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/q<",
            "Le/b/a/y/z/e/u;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le/b/a/y/z/e/n;

    invoke-direct {v0}, Le/b/a/y/z/e/n;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/z/e/o;

    invoke-direct {v0}, Le/b/a/y/z/e/o;-><init>()V

    .line 3
    new-instance v0, Le/b/a/y/z/e/r;

    invoke-direct {v0}, Le/b/a/y/z/e/r;-><init>()V

    sput-object v0, Le/b/a/y/z/e/u;->a:Le/b/a/y/z/e/u;

    .line 4
    new-instance v0, Le/b/a/y/z/e/p;

    invoke-direct {v0}, Le/b/a/y/z/e/p;-><init>()V

    sput-object v0, Le/b/a/y/z/e/u;->b:Le/b/a/y/z/e/u;

    .line 5
    new-instance v0, Le/b/a/y/z/e/q;

    invoke-direct {v0}, Le/b/a/y/z/e/q;-><init>()V

    sput-object v0, Le/b/a/y/z/e/u;->c:Le/b/a/y/z/e/u;

    .line 6
    new-instance v0, Le/b/a/y/z/e/s;

    invoke-direct {v0}, Le/b/a/y/z/e/s;-><init>()V

    sput-object v0, Le/b/a/y/z/e/u;->d:Le/b/a/y/z/e/u;

    .line 7
    sget-object v0, Le/b/a/y/z/e/u;->c:Le/b/a/y/z/e/u;

    sput-object v0, Le/b/a/y/z/e/u;->e:Le/b/a/y/z/e/u;

    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"

    .line 8
    invoke-static {v1, v0}, Le/b/a/y/q;->a(Ljava/lang/String;Ljava/lang/Object;)Le/b/a/y/q;

    move-result-object v0

    sput-object v0, Le/b/a/y/z/e/u;->f:Le/b/a/y/q;

    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Le/b/a/y/z/e/u;->g:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(IIII)Le/b/a/y/z/e/t;
.end method

.method public abstract b(IIII)F
.end method
