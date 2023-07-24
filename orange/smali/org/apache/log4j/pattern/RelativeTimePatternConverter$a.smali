.class public final Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/log4j/pattern/RelativeTimePatternConverter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a;->a:J

    .line 3
    iput-object p3, p0, Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(JLjava/lang/StringBuffer;)Z
    .locals 3

    .line 1
    iget-wide v0, p0, Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a;->a:J

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 2
    iget-object p1, p0, Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a;->b:Ljava/lang/String;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
