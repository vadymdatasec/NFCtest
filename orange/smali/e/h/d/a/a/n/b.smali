.class public final synthetic Le/h/d/a/a/n/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Le/h/d/a/a/n/o;


# static fields
.field public static final synthetic a:Le/h/d/a/a/n/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Le/h/d/a/a/n/b;

    invoke-direct {v0}, Le/h/d/a/a/n/b;-><init>()V

    sput-object v0, Le/h/d/a/a/n/b;->a:Le/h/d/a/a/n/b;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Le/h/d/a/a/n/p;->b(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
